package com.example.controller;

import com.example.entity.AddEntity;
import com.example.entity.HistoryEntity;
import com.example.entity.RespEntity;
import com.example.service.AddService;
import com.example.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd/");    //定义时间格式

    @PostMapping("/upload")
    public String importData(MultipartFile file, HttpServletRequest req) throws FileNotFoundException {
        String format = sdf.format(new Date());     //获取时间

        // 定义保存文件的文件夹的路径

        /*
        * 发布
        *  开发时equest.getServletContext().getRealPath("/")
        * 方法获得的路径不是项目路径，而是c盘下一个tomcat目录路径
        * 实际上传到springboot临时的tomcat目录，如果项目发布了就会是实际的工程目录了
        * */
         String realPath = req.getServletContext().getRealPath("/upload") + format;

        /*
        * 开发
        * 实际上传到开发时target下的目录
        * //在开发测试模式时，得到的地址为：{项目跟目录}/target/static/upload/
        * //在打包成jar正式发布时，得到的地址为：{发布jar包目录}/static/upload/
        * */
        //String realPath = ResourceUtils.getURL("classpath:").getPath()+new String("/static/upload")+format;

        /*
        * 指定保存绝对路径
        * */
        //String realPath = new String("C:\\Users\\Administrator\\Desktop\\project\\sise\\src\\main\\resources\\static\\upload");

        File folder = new File(realPath);
        //判断保存路径的存放文件的文件夹是否存在，不存在则创建
        if (!folder.exists()) {
            folder.mkdirs();
        }
        //获取上传文件名
        String oldName = file.getOriginalFilename();
        //重新命名并且截切文件后缀拼接
        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."));
        //文件写入
        try {
            file.transferTo(new File(folder,newName));
            //访问路径
           String url = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + "/upload" + format + newName;
            System.out.println(url);
            return url;
        }catch (Exception e){
            e.printStackTrace();
        }
            return "上传失败";
    }

    @Autowired
    AddService addService;
    @PostMapping("/add")
    public RespEntity addList(AddEntity addEntity){
        System.out.println(addEntity.toString());
        if(addService.add(addEntity) == 1){
            return RespEntity.success("提交成功");
        }
        return RespEntity.falied("提交失败");
    }

    @Autowired
    HistoryService historyService;
    @GetMapping("/list")
    public List<HistoryEntity> getHistory(){
        //System.out.println(listService.getList());
        return  historyService.getHistory();
    }
}
