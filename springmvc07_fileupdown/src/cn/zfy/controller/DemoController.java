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
	//�򵥲�������&���󴫵�

/*	//�ļ�����
	@RequestMapping(value="demo21")
	public void demo21(String filename,HttpServletRequest req,HttpServletResponse resp) 
			throws IOException{
		//�ַ����������ʱ��Ҫ�ֽ���
		//resp.getWriter().out("aaaaaaaa");
		//resp.setContentType(type);
		//������Ӧͷ��Ϣ��ֻ���أ�����ʾ;��������ʱ����ļ���
		resp.setHeader("Content-Disposition", "attachment;filename=bbb.txt");
		//��ȡ�ַ������
		ServletOutputStream os = resp.getOutputStream();
		//��ȡfiles�ļ��е�·��,�Ӷ���ȡ�������ļ�·��
		String path=req.getServletContext().getRealPath("files");
		System.out.println(path);
		File file=new File(path, filename);
		//ͨ���ܰ������ļ�ת�ɶ������ֽ���
		byte[] bytes = FileUtils.readFileToByteArray(file);
		//ͨ���ַ���д��
		os.write(bytes);
		os.flush();
		os.close();
	}*/
	//�ļ��ϴ�
	/*@RequestMapping(value="demo22")
	public String demo22(MultipartFile file,String name) throws IOException {
		//��ȡ�ϴ��ļ������ƣ��еĺܳ�����������·��&�ļ���׺
		String fileName=file.getOriginalFilename();
		//��ȡ�ļ���׺
		String suffix = fileName.substring(fileName.lastIndexOf("."));
		//��ȡUUID�������ļ������ظ�
		String uuid = UUID.randomUUID().toString();
		//����ת�����ļ����������
		FileUtils.copyInputStreamToFile(file.getInputStream(), new File("E:/"+uuid+suffix));
		return "/index.jsp";
	}*/
	
	
}
