
interface Debugprintable {
//    public static int NO_ERROR = 0;
//    public static int FILE_ERROR = 1;
//    public static int MEMORY_ERROR = 2;
//    public static String PREFIX = "ERROR:";
    
    enum ErrorStstus{
        NO_ERROR(0),FILE_ERROR(1),MEMORY_ERROR(2);
        private int StatusCade;
        private ErrorStstus(int Status) {
            // TODO 自動生成されたコンストラクター・スタブ
            this.StatusCade = Status;
        }
        public int getStatus(){
            return StatusCade;
        }
    }
    void debugprint();
}

