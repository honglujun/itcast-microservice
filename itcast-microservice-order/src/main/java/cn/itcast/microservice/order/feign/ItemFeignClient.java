package cn.itcast.microservice.order.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.itcast.microservice.order.pojo.Item;

/**
 * @author win10
 * @FeignClient(value = "itcast-microservice-item") 申明这是一个Feign客户端，并且指明服务id
 */
@FeignClient(value = "itcast-microservice-item")
public interface ItemFeignClient {

    /**
     * 调用商品的微服务提供的接口进行查询数据
     * @param id
     * @return
     */
    @RequestMapping(value = "/item/{id}", method = RequestMethod.GET)
    Item queryItemById(@PathVariable("id") Long id);

}
