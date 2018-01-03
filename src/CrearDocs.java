import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.util.Units;
import org.apache.poi.xwpf.model.XWPFHeaderFooterPolicy;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFFooter;
import org.apache.poi.xwpf.usermodel.XWPFHeader;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr;

//import com.itextpdf.text.Document;
//import com.itextpdf.text.Image;
//import com.itextpdf.text.pdf.PdfWriter;

public class CrearDocs {
	
	public String imagen="";
	public String nameDocIn="";
	public String nameDocOut="";
	public String nameEmpresa="";
	public FileInputStream in;
	public XWPFDocument doc;
	
	
	public CrearDocs(String imagen, String nameDocIn, String nameDocOut, String nameEmpresa) throws IOException {
		this.imagen=imagen;
		this.nameDocIn=nameDocIn;
		this.nameDocOut=nameDocOut;
		this.nameEmpresa=nameEmpresa;
		try {
			
			this.in = new FileInputStream(this.nameDocIn);
			this.doc = new XWPFDocument(in);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	//public static void main(String arr[]) throws IOException {
	//	CrearDocs cd=new CrearDocs("C:\\\\Users\\\\isiva\\\\casntp\\\\workspace\\\\NtpQuest\\\\WebContent\\img\\sample-1.jpg", "C:\\Users\\isiva\\casntp\\workspace\\NtpQuest\\WebContent\\docs\\tesst.docx", "user.docx", "Empresa X");
	//	cd.generarDoc();
		
	//}
	public void generarDoc() {
		try {
			

			XWPFParagraph paragraph = doc.createParagraph();
			XWPFParagraph imgp = doc.createParagraph();
			XWPFRun run=paragraph.createRun();
			
			CTSectPr sectPr = doc.getDocument().getBody().addNewSectPr();
			XWPFHeaderFooterPolicy headerFooterPolicy = new XWPFHeaderFooterPolicy(doc, sectPr);
			XWPFHeader header = headerFooterPolicy.createHeader(XWPFHeaderFooterPolicy.DEFAULT);
			paragraph = header.createParagraph();
			paragraph.setAlignment(ParagraphAlignment.LEFT);
			run = paragraph.createRun();  
			run.setText(nameEmpresa);
			run.setBold(true);
			//run.addBreak();
			//run = paragraph.createRun(); 
			//run.setText("Emblematica casa agustina casa agustina cuna de pensadores e ilustres arequipeños");
			imgp=header.createParagraph();
			imgp.setAlignment(ParagraphAlignment.RIGHT);
			run = imgp.createRun();
			String imgFile=imagen;
			run.addPicture(new FileInputStream(imgFile), XWPFDocument.PICTURE_TYPE_PNG, imgFile, Units.toEMU(130), Units.toEMU(45));

			XWPFFooter footer = headerFooterPolicy.createFooter(XWPFHeaderFooterPolicy.DEFAULT);
			paragraph = footer.createParagraph();
			paragraph.setAlignment(ParagraphAlignment.LEFT);
			run = paragraph.createRun();  
			run.setText(nameEmpresa);
			doc.write(new FileOutputStream(nameDocOut));
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
//	public void generarPdfImage(String imagen,String namePdfOut) {
//		 Document document = new Document();
//		    String input = imagen; 
//		    String output = namePdfOut;
//		    try {
//		      Image img = Image.getInstance(input);
//		      img.scalePercent(50);
//		      FileOutputStream fos = new FileOutputStream(output);
//		      PdfWriter writer = PdfWriter.getInstance(document, fos);
//		      writer.open();
//		      document.open();
//		      document.add(img);
//		      document.close();
//		      writer.close();
//		    }
//		    catch (Exception e) {
//		      e.printStackTrace();
//		    }
//	}

}
