import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            int n = Integer.parseInt(br.readLine());

            List<Member> members = new LinkedList<>();
            for (int i = 1; i <= n; i++) {
                StringTokenizer input = new StringTokenizer(br.readLine());
                int age = Integer.parseInt(input.nextToken());
                String name = input.nextToken();
                members.add(Member.of(i, name, age));
            }

            Collections.sort(members);

            for (Member member : members) {
                sb.append(member.getAge()).append(" ").append(member.getName()).append("\n");
            }

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}

class Member implements Comparable<Member> {
    private final int id;
    private final String name;
    private final int age;

    private Member(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static Member of(int id, String name, int age) {
        return new Member(id, name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Member o) {
        if (this.age == o.age) {
            return this.id - o.id;
        }

        return this.age - o.age;
    }
}