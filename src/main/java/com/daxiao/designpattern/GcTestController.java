package com.daxiao.designpattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/7/3
 */
@RequestMapping("/test")
@RestController
public class GcTestController {

    private Queue<ResourceHolder> queue = new ConcurrentLinkedQueue<>();

    @RequestMapping("/gc")
    public ResourceHolder gc() {
        ResourceHolder daxiao = new ResourceHolder("daxiao");
        if (queue.size() >= 20000) {
            queue.clear();
        } else {
            queue.add(daxiao);
        }
        return daxiao;
    }
}

@Data
@AllArgsConstructor
class ResourceHolder {
    private String message;
}