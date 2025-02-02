import java.awt.Graphics;

/**
 * This class implements the Decorator Pattern. It adds the arrowhead for association
 * over the basic line.
 */

public class AssociationDecoration extends JustLineDecorator {

    int[] ix = new int[3];
    int[] iy = new int[3];

    public AssociationDecoration(Arrow arrow) {
        super(arrow);
    }

    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        Graphics g = RightPanel.rightPanel.getGraphics();
        super.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x2 - 10, y2 - 10);
        g.drawLine(x2, y2, x2 + 10, y2 - 10);
        g.dispose();
    }

}
