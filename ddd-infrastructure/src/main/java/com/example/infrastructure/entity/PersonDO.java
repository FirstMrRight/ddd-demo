package com.example.infrastructure.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 描述类的作用
 *
 * @author: ex_zengrs
 * @date: 2021年04月15日 9:36 Description:
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("person")
public class PersonDO extends Model<PersonDO> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value="id",type = IdType.AUTO)
    private Long id;

    /**
     * 年龄
     */
    @TableField("age")
    private Integer age;

    /**
     * 性别
     */
    @TableField("sex")
    private Integer sex;

    /**
     * 名字
     */
    @TableField("name")
    private String name;

    /**
     * 省
     */
    @TableField("province")
    private String province;

    /**
     * 市
     */
    @TableField("city")
    private String city;

    /**
     * 区/县
     */
    @TableField("county")
    private String county;

    /**
     * 街道
     */
    @TableField("street")
    private String street;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

