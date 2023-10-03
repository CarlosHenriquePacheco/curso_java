package classe;

import java.util.Date;

public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.setNome("Carlos Henrique");
        u1.setEmail("pacheco.henrique@gmail.com");

        Usuario u2 = new Usuario();
        u2.setNome("Carlos Henrique");
        u2.setEmail("pacheco.henrique@gmail.com");

        System.out.println(u1==u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));
        System.out.println(u2.equals(new Date()));
    }
}
