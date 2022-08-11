package io.lihongbin.sqltest.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Li Hong Bin
 * @since 2022-05-24
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("association_test1")
@NoArgsConstructor
public class AssociationTest1 implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long randomNum;

    private String parentName;

    public AssociationTest1(Long randomNum, String parentName) {
        this.randomNum = randomNum;
        this.parentName = parentName;
    }

}
