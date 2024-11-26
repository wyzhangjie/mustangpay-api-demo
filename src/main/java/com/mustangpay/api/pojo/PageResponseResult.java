package com.mustangpay.api.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Data
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PageResponseResult<T> implements Serializable {

    private Integer total;

    private Integer pageNo;

    private Integer pageSize;

    private List<T> list;

}
