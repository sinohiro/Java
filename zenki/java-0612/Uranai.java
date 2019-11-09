class Uranai {
    String name;
    String nameid;

    //コンストラクタ
    Uranai(String name, String nameid) {
	this.name = name;
	this.nameid = nameid;
    }

    void hantei(Uranai b) {
	String and = this.nameid + b.nameid;
	System.out.println(and);
	int calc = keisan(and);
	System.out.println("私と「" + b.name + "」君の相性は" + calc + "%です");
    }

    static void hantei(Uranai a, Uranai b) {
	String and = a.nameid + b.nameid;
        System.out.println(and);
        int calc = keisan(and);
        System.out.println("「" + a.name + "」君と「" + b.name + "」君の相性は" + calc + "%です");
    }
/*
    int keisan(String and) {
	int i, num, num2, numid = 0;
	int result = 0;
	String sid, andid;

	while(and.length() >= 3) {
	    String calc_id = "";

	    for (i = 0; i < and.length() - 1 ; i++) {
		String id = and.substring(i, i + 1);
		String id2 = and.substring(i + 1, i + 2);
		
		num = Integer.parseInt(id);
		num2 = Integer.parseInt(id2);

		numid = num + num2;
		if (numid > 9) {
		    numid -= 10;
		}
	    	calc_id += numid;
	    }
	    and = calc_id;
	    System.out.println(and);
	}
	result = Integer.parseInt(and);
	return (result);
    }
*/
    static int keisan(String and) {
        int i, num, num2, numid = 0;
        int result = 0;
        String sid, andid;

        while(and.length() >= 3) {
            String calc_id = "";

            for (i = 0; i < and.length() - 1 ; i++) {
                String id = and.substring(i, i + 1);
                String id2 = and.substring(i + 1, i + 2);

                num = Integer.parseInt(id);
                num2 = Integer.parseInt(id2);

                numid = num + num2;
                if (numid > 9) {
                    numid -= 10;
                }
                calc_id += numid;
            }
            and = calc_id;
            System.out.println(and);
        }
        result = Integer.parseInt(and);
        return (result);
    }

    void print() {
	System.out.println("私の名前は「" + this.name + "」です");
    }
}
