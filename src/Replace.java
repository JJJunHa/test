
public class Replace {

	public static void main(String[] args) {
		String[] babbling= {"ayaye", "uuu", "yeye", "yemawoo", "ayaya"};
		String[] baby={"aya", "ye", "woo", "ma" };   // �Ӿ��̰� ������ �� �ִ� ����
        int count=0;
        
        for(int i=0;i<babbling.length;i++) {   // �������� �־��� �ܾ���� ������ŭ �ݺ��� ����
            for(int j=0;j<baby.length; j++) {   // �Ӿ��̰� ���� �� �� �ִ� ���� ������ŭ �ݺ��� ����
                if(babbling[i].contains(baby[j]+baby[j])) continue; // ���� ���ӵ� ������ ���ð�� continue�� �����
                                                                    //  ������ �Ѿ���� �մϴ�.
                else if(babbling[i].contains(baby[j])) babbling[i]=babbling[i].replace(baby[j],"1");
                 // ���ӵ� ������ ������ �ʰ� �Ӿ��̰� ���� �� �� �ִ� �ܾ ������ ���ִٸ� �� �κ��� 1�� �ٲߴϴ�.
            }
            System.out.println(babbling[i]);
            if(babbling[i].matches("^[0-9]*$")) count++;  // matches�� ���ڷθ� �̷�������� ã�Ƴ��� count++�� ���ݴϴ�.
        }
        	System.out.println("---------------");
    //replace("aya","1"): replace("aya","1")�� "aya"��� ���ڰ� ������ �� ���ڸ� 1�� �ٲ��ִ� ������ ���ݴϴ�.
    		String []a= {"aya", "yee", "u", "maa","aya"};
    		String []b= {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
    		for(int i=0; i<a.length; i++) {
    		a[i]=b[i].replace(a[i],"1");
    		System.out.println(a[i]);
    		}

	}
}

