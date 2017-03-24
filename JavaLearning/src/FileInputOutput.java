import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class FileInputOutput {
	
	//FileOutputStream
	public void fileIOtest() 
	{
		String st = "Hello";
		
		try{
			FileOutputStream fout = new FileOutputStream("D:\\FileIO\\newTextFile.txt");
			fout.write(65);
			byte b[]=st.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Success...");
		}
		catch(IOException e)
		{
			System.out.println("Exception Caught");
		}
	}
	
	//FileInputStream
	public void FileRead()
	{
		try
		{
			FileInputStream fin = new FileInputStream("D:\\FileIO\\newTextFile.txt");
			int i=0;
			while((i=fin.read())!=-1)
			{
				System.out.print((char)i);
			}
			fin.close();
		}
		catch(IOException e)
		{
			System.out.println("Exception Caught");
		}
	}
	
	//BufferedOutputStream
	
	public void BufferIO()
	{
		File f = new File("D:\\FileIO\\selCreatedFile.txt");		
		try
		{
			f.createNewFile();
			FileOutputStream fout = new FileOutputStream(f);
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			String s = "This is self created file";
			byte b[]=s.getBytes();
			bout.write(b);
			bout.flush();
			bout.close();
			fout.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		System.out.println("Success...");
	}
	
	public void bufferRead()
	{
		try
		{
			FileInputStream fin = new FileInputStream("D:\\FileIO\\selCreatedFile.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			int i = 0;
			while ((i=bin.read())!=-1)
			{
				System.out.print(((char)i));
			}
			bin.close();
			fin.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	
	public void multipleFileRead()
	{
		try
		{
			FileInputStream fin = new FileInputStream("D:\\FileIO\\newTextFile.txt");
			FileInputStream fin1 = new FileInputStream("D:\\FileIO\\selCreatedFile.txt");
			SequenceInputStream sin = new SequenceInputStream(fin, fin1);
			int i;
			while((i=sin.read())!=-1)
			{
				System.out.print((char)i);
			}
			sin.close();
			fin1.close();
			fin.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) 
	{
		FileInputOutput fs= new FileInputOutput();
		//fs.fileIOtest();
		//fs.FileRead();
		//fs.BufferIO();
		//fs.bufferRead();
		fs.multipleFileRead();

	}
	

}
