package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicMethod();

        // 같은 패키지 내에서만 호출이 가능
//        data.defaultField =2 ;
//        data.defaultMethod();

        data.innerAccess();
    }
}
