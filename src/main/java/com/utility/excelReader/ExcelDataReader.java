package com.utility.excelReader;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ExcelDataReader {
	File file;
	POIFSFileSystem  poi = new POIFSFileSystem(new FileInputStream(file));

}
