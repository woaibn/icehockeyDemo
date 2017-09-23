package com.icehockey.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class UploadServlet2
 */
public class UploadServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);

		if (isMultipart) {
			DiskFileItemFactory factory = new DiskFileItemFactory();

			// Configure a repository (to ensure a secure temp location is used)
			ServletContext servletContext = this.getServletConfig()
					.getServletContext();

			File repository = (File) servletContext
					.getAttribute("javax.servlet.context.tempdir");
			factory.setRepository(repository);

			// Create a new file upload handler
			ServletFileUpload upload = new ServletFileUpload(factory);
			upload.setHeaderEncoding("utf-8");

			try {
				List<FileItem> items = upload.parseRequest(request);

				for (FileItem item : items) {
					if (item.isFormField()) {
						System.out.println(item.getFieldName());
						System.out.println(item.getString("utf-8"));
					} else {
						String savePath = "..\\..\\img\\part4" + File.separator
								+ "pic";
						File fileSaveFolder = new File(savePath);
						if (!fileSaveFolder.exists()) {
							fileSaveFolder.mkdir();
						}
						File tempfile = new File(item.getName());
						Date date = new Date();
						DateFormat format = new SimpleDateFormat(
								"yyyyMMddHHmmss");
						String time = format.format(date);
						System.out.println(time);
						String newFileName = time+ tempfile.getName();
						System.out.println("保存文件名"+newFileName);

						 //获取Tomcat服务器所在的路径  
			            String tomcat_path = System.getProperty( "user.dir" );  
			            //获取Tomcat服务器所在路径的最后一个文件目录  
			            String bin_path = tomcat_path.substring(tomcat_path.lastIndexOf("\\")+1,tomcat_path.length());  
			            //若最后一个文件目录为bin目录，则服务器为手动启动  
			            if(("bin").equals(bin_path)){//手动启动Tomcat时获取路径为：D:\Software\Tomcat-8.5\bin  
			                //获取保存上传图片的文件路径  
			                String pic_path=tomcat_path.substring(0,System.getProperty("user.dir").lastIndexOf("\\")) +"\\webapps"+"\\pic_file\\";  
			                //图片重命名  
			                //创建图片文件  
			                File uploadedFile = new File(pic_path +"\\"+ newFileName);  
			                // 将内存中的数据写入磁盘  
			                item.write(uploadedFile);
			            }else{//服务中自启动Tomcat时获取路径为：D:\Software\Tomcat-8.5  
			                String pic_path = tomcat_path+"\\webapps"+"\\upload\\";  			  
			                File uploadedFile = new File(pic_path +"\\"+ newFileName);  
			                // 将内存中的数据写入磁盘  
			                item.write(uploadedFile);
			            }  			           			          			     
						response.setContentType("text/html;charset=utf-8");
						PrintWriter out1 = response.getWriter();

						// out1.print("<script>parent.callback('//upload//"+tempfile.getName()+"');</script>");
						out1.print("<script>parent.callback('" + newFileName
								+ "');</script>");

					}
				}

			} catch (FileUploadException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
