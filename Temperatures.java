
import java.util.Scanner;


public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while(true) {
            System.out.println("Add a temperature between -30 and +40 degrees:");
            double currentTemp = Double.parseDouble(reader.nextLine());
            if (currentTemp > -30 && currentTemp <= 40) {
                Graph.addNumber(currentTemp);
            } else if (currentTemp == 1.1){
                break;
            }
        }
        Graph.getInstance();
        // Graph is used as follows:

        // Remove or comment out these lines above before trying to run the tests.
    }
}
import org.jfree.chart.*;
import org.jfree.chart.axis.*;
import org.jfree.chart.plot.*;
import org.jfree.chart.renderer.xy.*;
import org.jfree.data.xy.*;

/** DO NOT MODIFY THIS FILE */

public class Graph {

    private ChartFrame frame;
    private JFreeChart chart;
    private Plot plot;
    private XYDataset data;
    private XYSeries series;

    public Graph(String nimi) {
        series = new XYSeries(nimi);
        series.add(0,0);
        data = new XYSeriesCollection(series);
        plot = new XYPlot(data, new NumberAxis("x"), new NumberAxis("y"), new SamplingXYLineRenderer());
        chart = new JFreeChart(plot);
        frame = new ChartFrame(nimi,chart);
        frame.pack();
        frame.setVisible(true);
    }

    public static Graph instance;

    public static Graph getInstance() {
        if (instance == null)
            instance = new Graph("Graph");
        return instance;
    }

    public static void addNumber(double y) {
        getInstance().lisaaNumero_(y);
    }

    public void lisaaNumero_(double y) {
        double x = series.getMaxX()+1;
        series.add(x,y);
    }
}
