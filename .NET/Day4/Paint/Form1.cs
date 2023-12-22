using AWT.Draw;
using System.Drawing;
namespace Paint;

public partial class Form1 : Form
{
    AWT.Draw.Point startpoint;
    AWT.Draw.Point endpoint;
    public Form1()
    {
        Paint+=new System.Windows.Forms.PaintEventHandler(OnPaint);
        MouseDown+=new System.Windows.Forms.MouseEventHandler(OnMouseDown);
        MouseUp+=new System.Windows.Forms.MouseEventHandler(OnMouseUp);
        InitializeComponent();
    }
    public void OnPaint(object sender, PaintEventArgs e){
       
    }
     public void OnMouseDown(object sender, MouseEventArgs e)
     {
         startpoint=new AWT.Draw.Point(e.X,e.Y);
     }
    public void OnMouseUp(object sender, MouseEventArgs e)
    {
        endpoint = new AWT.Draw.Point(e.X,e.Y);
        Line l = new Line(startpoint,endpoint,3,"red");
                //Line l=new Line(startPoint, endPoint, 3, "red");
        // Pen pen = new Pen(Color.FromArgb(255,0,0,0));
        // Graphics g = this.CreateGraphics();
        // g.DrawLine(pen,l.startPoint.X,l.startPoint.Y,l.endPoint.X,l.endPoint.Y);
       Pen pen = new Pen(Color.FromArgb(255, 255, 0, 0));
        Graphics g=this.CreateGraphics();
        g.DrawLine(pen,l.Startpoint.X, l.Startpoint.Y, l.Endpoint.X, l.Endpoint.Y);
    }
}
