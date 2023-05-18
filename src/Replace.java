
public class Replace {

	public static void main(String[] args) {
		String[] babbling= {"ayaye", "uuu", "yeye", "yemawoo", "ayaya"};
		String[] baby={"aya", "ye", "woo", "ma" };   // 머쓱이가 발음할 수 있는 발음
        int count=0;
        
        for(int i=0;i<babbling.length;i++) {   // 랜덤으로 주어진 단어들의 갯수만큼 반복문 실행
            for(int j=0;j<baby.length; j++) {   // 머쓱이가 발음 할 수 있는 발음 갯수만큼 반복문 실행
                if(babbling[i].contains(baby[j]+baby[j])) continue; // 만약 연속된 발음이 나올경우 continue를 사용해
                                                                    //  빠르게 넘어가도록 합니다.
                else if(babbling[i].contains(baby[j])) babbling[i]=babbling[i].replace(baby[j],"1");
                 // 연속된 발음이 나오지 않고 머쓱이가 발음 할 수 있는 단어가 포함이 되있다면 그 부분을 1로 바꿉니다.
            }
            System.out.println(babbling[i]);
            if(babbling[i].matches("^[0-9]*$")) count++;  // matches로 숫자로만 이루어진곳을 찾아내고 count++을 해줍니다.
        }
        	System.out.println("---------------");
    //replace("aya","1"): replace("aya","1")는 "aya"라는 문자가 있으면 그 문자를 1로 바꿔주는 역할을 해줍니다.
    		String []a= {"aya", "yee", "u", "maa","aya"};
    		String []b= {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
    		for(int i=0; i<a.length; i++) {
    		a[i]=b[i].replace(a[i],"1");
    		System.out.println(a[i]);
    		}

	}
}

