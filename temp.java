public class temp {

   public static void main(String[] arg){

    // example of Locale
    Locale locale = new Locale("en", "US");
    locale = new Locale("en", "GB");

    // example of TimeZone
    TimeZone timeZone = TimeZone.getTimeZone("GMT");
    timeZone = TimeZone.getTimeZone("PST");

    // example of NumberFormat
    NumberFormat numberFormat = NumberFormat.getInstance();
    numberFormat = NumberFormat.getCurrencyInstance();

    // example of DateFormat
    DateFormat dateFormat = DateFormat.getDateInstance();
    dateFormat = DateFormat.getTimeInstance();

    // example of SimpleDateFormat
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    // example of MessageFormat
    MessageFormat messageFormat = new MessageFormat("Hello, {0}!");
    messageFormat = new MessageFormat("Hello, {0}! You have {1} messages.");

    // example of Random
    Random random = new Random();
    random = new Random(1);

    // example of Scanner
    Scanner scanner = new Scanner(System.in);
    scanner = new Scanner("A B");
    
    // example of StringTokenizer
    StringTokenizer stringTokenizer = new StringTokenizer ("A B");
    stringTokenizer = new StringTokenizer ("A B", " ");
     // example of BufferedReader
     BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
     bufferedReader = new BufferedReader(new StringReader("A B"));

     // example of BufferedWriter
     BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
     bufferedWriter = new BufferedWriter(new StringWriter());

     // example of PrintWriter
     PrintWriter printWriter = new PrintWriter(System.out);
     printWriter = new PrintWriter(new StringWriter());

     // example of FileReader
     FileReader fileReader = new FileReader("test.txt");
     fileReader = new FileReader(new File("test.txt"));

     // example of FileWriter
     FileWriter fileWriter = new FileWriter("test.txt");
     fileWriter = new FileWriter(new File("test.txt"));

     // example of FileInputStream
     FileInputStream fileInputStream = new FileInputStream("test.txt");
     fileInputStream = new FileInputStream(new File("test.txt"));

     // example of FileOutputStream
     FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
     fileOutputStream = new FileOutputStream(new File("test.txt"));

     // example of ObjectInputStream
     ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("test.txt"));
     objectInputStream = new ObjectInputStream(new FileInputStream(new File("test.txt")));

     // example of ObjectOutputStream
     ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("test.txt"));
     objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("test.txt")));

     // example of ZipInputStream
     ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream("test.zip"));
     zipInputStream = new ZipInputStream(new FileInputStream(new File("test.zip")));

     // example of ZipOutputStream
     ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream("test.zip"));
     zipOutputStream = new ZipOutputStream(new FileOutputStream(new File("test.zip")));

     // example of GZIPInputStream
     GZIPInputStream gzipInputStream = new GZIPInputStream(new FileInputStream("test.gz"));
     gzipInputStream = new GZIPInputStream(new FileInputStream(new File("test.gz")));

     // example of GZIPOutputStream
     GZIPOutputStream gzipOutputStream = new GZIPOutputStream(new FileOutputStream("test.gz"));
     gzipOutputStream = new GZIPOutputStream(new FileOutputStream(new File("test.gz")));

     // example of JarInputStream
     JarInputStream jarInputStream = new JarInputStream(new FileInputStream("test.jar"));
     jarInputStream = new JarInputStream(new FileInputStream(new File("test.jar")));

     // example of JarOutputStream
     JarOutputStream jarOutputStream = new JarOutputStream(new FileOutputStream("test.jar"));
     jarOutputStream = new JarOutputStream(new FileOutputStream(new File("test.jar")));

     // example of DataInputStream
     DataInputStream dataInputStream = new DataInputStream(new FileInputStream("test.txt"));
     dataInputStream = new DataInputStream(new FileInputStream(new File("test.txt")));

     // example of DataOutputStream
     DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("test.txt"));
     dataOutputStream = new DataOutputStream(new FileOutputStream(new File("test.txt")));

     // example of BufferedInputStream
     BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("test.txt"));
     bufferedInputStream = new BufferedInputStream(new FileInputStream(new File("test.txt")));

     // example of BufferedOutputStream
     BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("test.txt"));
     bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File("test.txt")));

     // example of PrintStream
     PrintStream printStream = new PrintStream(System.out);
     printStream = new PrintStream(new FileOutputStream("test.txt"));
     printStream = new PrintStream(new FileOutputStream(new File("test.txt")));

   } 
}
