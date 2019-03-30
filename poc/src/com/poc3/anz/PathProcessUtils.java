package com.poc3.anz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PathProcessUtils {

	private static final Map<String, ProcessPath> PATHS;

	static {
		final Map<String, ProcessPath> paths = new HashMap<>();
		paths.put("PATH-A", new ProcessCollection() {

			@Override
			public ResponseData processCollection() {
				// TODO Auto-generated method stub
				return new ResponseData(1, "this path is returing a simple object");
			}
		});

		paths.put("PATH-B", new ProcessListOfCollection() {

			List<ResponseData> responseDatas = new ArrayList<>();

			@Override
			public List<ResponseData> processListOfCollection() {
				// TODO Auto-generated method stub
				responseDatas.add(new ResponseData(1, "This is first entry for List"));
				responseDatas.add(new ResponseData(2, "This is second entry for List"));
				responseDatas.add(new ResponseData(3, "This is third entry for List"));
				return responseDatas;
			}
		});

		paths.put("PATH-C", new ProcessListOfCollection() {

			List<ResponseData> responseDatas = new ArrayList<>();

			@Override
			public List<ResponseData> processListOfCollection() {
				// TODO Auto-generated method stub
				responseDatas.add(new ResponseData(1, "This is first entry for List"));
				responseDatas.add(new ResponseData(2, "This is second entry for List"));
				responseDatas.add(new ResponseData(3, "This is third entry for List"));
				return responseDatas;
			}
		});

		PATHS = Collections.unmodifiableMap(paths);
	}

}
