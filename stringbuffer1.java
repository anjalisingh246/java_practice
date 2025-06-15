public class stringbuffer1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(" Hello ");
        sb.append("world");
        System.out.println(sb);
        sb.insert(0, "java");
        System.out.println(sb);
        sb.delete(0,4);
        System.out.println(sb);
        sb.replace(0,5,"hi");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        
    }
}
