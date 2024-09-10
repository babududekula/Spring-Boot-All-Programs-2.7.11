package com.pack.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.dao.HostelDao;
import com.pack.entity.Hostel;

@Service
public class ServiceClass 
{
	@Autowired
	private HostelDao repo;
	
	public void saveData() throws Exception
	{
		Hostel h = new Hostel();
		h.setName("Babu");
		h.setRent("4700");
		
		String image = "G:\\AnotherCopiedPhoto.jpg";
		File f = new File(image);
		FileInputStream fis = new FileInputStream(f);
		long size = Files.size(Path.of(image));
		byte[] b = new byte[(int)size];
		fis.read();
		fis.close();
		
		h.setImage(b);
		
		repo.save(h);
	}
	
	public void getData() throws Exception
	{
		Hostel h = new Hostel();
		
		Optional<Hostel> findById = repo.findById(1);
		byte[] image = findById.get().getImage();
		String str = "G:\\DataBaseNaturePhotot1.JPG";
		File f = new File(str);
		FileOutputStream fos = new FileOutputStream(f);
		fos.write(image);
		fos.close();
		
	}
}
