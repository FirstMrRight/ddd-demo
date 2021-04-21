package com.example.infrastructure.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;

import lombok.Data;

/**
 * @author ex_zengrs
 * @date 2021年03月22日 9:50
 */
@Data
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    // @ApiModelProperty(value = "主键")
    // @TableId(value = "id", type = IdType.AUTO)
    @TableId(value = "id")
    private Long id;

    // @ApiModelProperty(value = "是否删除，0 未删除， 1 删除")
    @TableLogic
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    private Integer deleted;

    // @ApiModelProperty(value = "是否可用，1 可用，0 不可用")
    @TableField(value = "available", fill = FieldFill.INSERT)
    private Integer available;

    // @ApiModelProperty(value = "创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    // @ApiModelProperty(value = "修改时间")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}
