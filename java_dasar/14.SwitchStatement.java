public class SwithStatement {

    public static void main(String[] args) {

        var nilai = "A";

        switch (nilai){
            case "A":
                System.out.println("anda lulus dengan sangat baik");
                break;
            case "B":
            case "C":
                System.out.println("anda lulus dengan nilai standard");
                break;
            case "D":
                System.out.println("anda tidak lulus");
                break;
            default:
                System.out.println("mungkin anda salah jurusan");
        }

//  switch lambda (java 14)

    switch (nilai)   {
        case "A" -> System.out.println("anda lulus dengan nilai yang baik");
        case "B", "C" -> System.out.println("nilai anda standard");
        case "D" -> System.out.println("anda tidak lulus");
        default -> {
            System.out.println("mungkin anda salah jurusan");
        }
    }

//  switch yield (java 14)

        // switch tanpa yield
        String nilaiKamu = "B";
        String ucapan;

        switch (nilaiKamu){
            case "A" -> ucapan = "Wow anda lulus dengan baik";
            case "B", "C" -> ucapan = "anda lulus";
            case "D" -> ucapan = "Anda tidak lulus";
            default -> ucapan = "mungkin anda salah jurusan";
        }
        System.out.println(ucapan);

        // switch dengan yield
        var nilaiDia = "C";
        String ucapanDarimu = switch (nilaiDia){
            case "A":
                yield "anda lulus dengan baik";
            case "B","C":
                yield "anda lulus";
            case "D":
                yield "anda tidak lulus";
            default:
                yield "anda mungkin salah jurusan";
        };
        System.out.println(ucapanDarimu);
        
    }
}
