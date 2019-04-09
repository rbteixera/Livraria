package br.com.casadocodigo.loja.infra;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component  //Colocando esta classe como um componente do spring
public class FileSaver {
	
	@Autowired
	private HttpServletRequest request;
	
	public String write(String baseFolder,MultipartFile file) {
		
		/* /casadocodigo/src/main/webapp/arquivos-sumario */
		try {
			System.out.println(request.getServletContext().getContextPath());			
			String realPath = request.getServletContext().getRealPath("/"+baseFolder);
			realPath = "/Users/rafaelteixeira/Documents/Estudo_Alura/EstudoFrameworkSpring/workspace/casadocodigo/src/main/webapp/arquivos-sumario";
			System.out.println(realPath);
			String path=realPath+"/"+file.getOriginalFilename();
			file.transferTo(new File(path));
			return path;
		} catch (IllegalStateException | IOException e) {
		  throw new RuntimeException(e);
		}
		
	}

}
