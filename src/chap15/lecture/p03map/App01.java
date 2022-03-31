package chap15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App01 {
	public static void main(String[] args) {
		//Map : (key,value)쌍으로 저장
		//(key,value) : entry, entry는 순서가 없음
		//key는 중복안됨
		
		Map<String, String> map = new HashMap<>();
		
		//put : entry 추가
		map.put("bts", "boy group");
		map.put("aespa", "girl group");
		map.put("tesla", "car");
		map.put("tesla", "elon musk");
		
		//size : entry 수
		int size = map.size();
		System.out.println(size); //3
		
		//get : key를 사용해서 value 얻음
		String val1 = map.get("bts");
		String val2 = map.get("aespa");
		String val3 = map.get("tesla");
		String val4 = map.get("bitcoin");
		
		System.out.println(val1); //boy group
		System.out.println(val2); //girl group
		System.out.println(val3); //elon musk
		System.out.println(val4); //null;
		
		//ketySet : key를 Set타입으로 리턴
		Set<String> keys = map.keySet();
		System.out.println(keys); //[bts, tesla, aespa] 순서는 보장안됨.
		
		//전체탐색1 : keySet, get
		Set<String> keyset = map.keySet();
		
		for(String key : keyset) {
			String value = map.get(key);
			
			System.out.println(key + ":" + value);
			//bts:boy group
			//tesla:elon musk
			//aespa:girl group					
		}
		
		//전체탐색2 : entrySet
		Set<Map.Entry<String, String>> entries = map.entrySet();
		
		for (Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		//이외에도 forEach로 탐색하는방법도 있음
		
		//remove : key로 entry 삭제
		map.remove("tesla");
		System.out.println(map.size()); //2
		System.out.println(map); //{bts=boy group, aespa=girl group}
		
		//containKey : key가 있는지 확인
		System.out.println(map.containsKey("aespa")); //true
		System.out.println(map.containsKey("tesla")); //false
	}
}
