/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年03月07日 10:00
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package com.suixingpay.datas.common.dic;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * 消费器插件
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年03月07日 10:00
 * @version: V1.0
 * @review: zhangkewei[zhang_kw@suixingpay.com]/2018年03月07日 10:00
 */
@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum  ConsumerPlugin {

    CANAL("CanalFetch", "Canal"),
    KAFKA("KafkaFetch", "Kafka");

    @Getter private final String code;
    @Getter private final String name;

    public static final List<ConsumerPlugin> PLUGINS = new ArrayList<ConsumerPlugin>() {
        {
            add(CANAL);
            add(KAFKA);
        }
    };

}
