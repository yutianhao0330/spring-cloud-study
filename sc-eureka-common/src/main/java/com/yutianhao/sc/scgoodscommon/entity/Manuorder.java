package com.yutianhao.sc.scgoodscommon.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author thyu
 * @since 2020-07-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Manuorder implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("idNo")
    private String idNo;

    private LocalDate createdate;

    private String empNum;

    private String personName;

    @TableField("manu_idNo")
    private String manuIdno;

    private String manuName;

    private String manuPersonName;

    private String manuPhone1;

    private String manuPhone2;

    private String pic;

    private Integer gid;

    private String remarks;

    private Integer num;

    private BigDecimal totalprice;


}
