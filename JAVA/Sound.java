public class Sound {
    public static void main(String[] args) {
        int SAMPLE_RATE = 44100;
        double hz = 400;
        double duration = 10;
        int n = (int) (SAMPLE_RATE * duration);
        double[] a = new double[n + 1];
        for (int i = 0; i <= n; i++) {
            a[i] = Math.sin(2 * Math.PI * hz * i / SAMPLE_RATE);
        }
        StdAudio.play(a);
    }
}
