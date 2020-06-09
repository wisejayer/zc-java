package com.example.controller;

import com.example.entity.*;
import com.example.mapper.MonitorMapper;
import com.example.service.ListService;
import com.example.service.MonitorService;
import com.example.until.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
@RestController
@RequestMapping("/monitor")
public class MonitorController {
    @Autowired
    ListService listService;

    @GetMapping("/list")
    public List<ListEntity> getList(){
        return listService.getList();
    }

    @Autowired
    MonitorService monitorService;

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public RespEntity update(FormEntity formEntity){
        if (monitorService.update(formEntity) == 1) {
            return RespEntity.success("更新成功!");
        }
        return RespEntity.falied("更新失败!");
    }

    @GetMapping("/pass/{no}")
    public RespEntity pass(@PathVariable Integer no){
        if (monitorService.pass(no) == 1) {
            return RespEntity.success("通过成功!");
        }
        return RespEntity.falied("通过失败!");
    }

    @RequestMapping(value = "/delete/{no}", method = RequestMethod.DELETE)
    public RespEntity delete(@PathVariable Integer no){
        if (monitorService.delete(no) == 1) {
            return RespEntity.success("删除成功!");
        }
        return RespEntity.falied("删除失败!");
    }

    @GetMapping("/grade")
    public List<GradeEntity> getGrade(){
        return monitorService.getGrade();
    }

    @GetMapping("/mark/{gradeid}")
    public List<CountEntity> getMark(@PathVariable Integer gradeid){
        return monitorService.getMark(gradeid);
    }

    @GetMapping("/export/{gradeid}")
    public Integer export(HttpServletResponse response,@PathVariable Integer gradeid){
        List<CountEntity> list = monitorService.getMark(gradeid);
        if(list != null && list.size() > 0){
           ExcelUtil.exportExcel(list, null, "用户数据", CountEntity.class, "成绩表.xls", response);
           return 1;
        }
        return 0;
    }
}
