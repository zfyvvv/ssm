package cn.zfy.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DemoController {
	//简单参数传递&对象传递

/*	//文件下载
	@RequestMapping(value="demo21")
	public void demo21(String filename,HttpServletRequest req,HttpServletResponse resp) 
			throws IOException{
		//字符输出流，此时需要字节流
		//resp.getWriter().out("aaaaaaaa");
		//resp.setContentType(type);
		//设置响应头信息，只下载，不显示;设置下载时候的文件名
		resp.setHeader("Content-Disposition", "attachment;filename=bbb.txt");
		//获取字符输出流
		ServletOutputStream os = resp.getOutputStream();
		//获取files文件夹的路径,从而获取需下载文件路径
		String path=req.getServletContext().getRealPath("files");
		System.out.println(path);
		File file=new File(path, filename);
		//通过架包，把文件转成二进制字节流
		byte[] bytes = FileUtils.readFileToByteArray(file);
		//通过字符流写出
		os.write(bytes);
		os.flush();
		os.close();
	}*/
	//文件上传
	/*@RequestMapping(value="demo22")
	public String demo22(MultipartFile file,String name) throws IOException {
		//获取上传文件的名称，有的很长，包括磁盘路径&文件后缀
		String fileName=file.getOriginalFilename();
		//获取文件后缀
		String suffix = fileName.substring(fileName.lastIndexOf("."));
		//获取UUID，保障文件名不重复
		String uuid = UUID.randomUUID().toString();
		//把流转换成文件并添加名称
		FileUtils.copyInputStreamToFile(file.getInputStream(), new File("E:/"+uuid+suffix));
		return "/index.jsp";
	}*/
	
	
}
