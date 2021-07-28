package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

	@GetMapping("/primes/{limit}")
	public Map<String, Object> index(@PathVariable("limit") Integer limit) throws Exception {

		if (limit != null) {
			int i =0;
			int num =0;
			ArrayList<Integer> arr= new ArrayList<>();
			for (i = 1; i <= limit; i++)
			{
				int counter=0;
				for(num =i; num>=1; num--)
				{
					if(i%num==0) { counter = counter + 1; }

				}

				if (counter ==2){ arr.add(i);}

			}
			HashMap<String, Object> hashMap = new HashMap<>();
			hashMap.put("Initial", limit);
			hashMap.put("Primes", arr);
			return hashMap;

		} else {
			throw new Exception("Please add a valid number to the URL");
		}

	}

}
