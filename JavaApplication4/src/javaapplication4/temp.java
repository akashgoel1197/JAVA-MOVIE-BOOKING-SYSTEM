/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Akash
 */
public class temp {
    public void paint(Graphics g)
	{
		//ArrayList<Integer> list = new ArrayList<Integer>(array);

		super.paint(g);					// Clears the frame when method is called

		int width = 32;					// State width of each Rectangle
		int height = 32;				// State height of each Rectangle

		int leftBlockSeatsCol = 6;		// State number of Rows in the Left Block
		int leftBlockSeatsRow = 6;		// State number of Columns in the Left Block
		int centerBlockSeatsRow = 5;	// State number of Rows in the Center Block
		int centerBlockSeatsCol = 8;	// State number of Columns in the Center Block
		int rightBlockSeatsRow = 6;		// State number of Rows in the Right Block
		int rightBlockSeatsCol = 6;		// State number of Columns in the Right Block

		int leftBlockPosX = 15;														// Sets Left Block X-axis Position (in Pixels)
		int leftBlockPosY = 225;														// Sets Left Block Y-axis Position (in Pixels)
		int centerBlockPosX = (leftBlockPosX+(leftBlockSeatsCol*width)) +50;		// Sets Center Block X-axis Position (in Pixels)
		int centerBlockPosY = 225;													// Sets Center Block Y-axis Position (in Pixels)
		int rightBlockPosX = (centerBlockPosX +(centerBlockSeatsCol*width)) +50;	// Sets Right Block X-axis Position (in Pixels)
		int rightBlockPosY = 225;													// Sets Right Block Y-axis Position (in Pixels)

		g.setColor(Color.black);		// Set Default Draw Color to black

		g.drawString("Left Block", (leftBlockPosX+(32*(leftBlockSeatsCol/2)-25)), (leftBlockPosY - 10));			// Title for Each Block
		g.drawString("Center Block", (centerBlockPosX+(32*(centerBlockSeatsCol/2)-30)), (centerBlockPosY - 10));
		g.drawString("Right Block", (rightBlockPosX+(32*(rightBlockSeatsCol/2)-25)), (rightBlockPosY - 10));

		Color custom_grey = new Color(175,175,175);

//DRAW LEFT BLOCK OF SEATS

		for(int i=0; i<leftBlockSeatsCol;i++)												// Loop while there are Columns..
		{
			String colString = new Integer (i+101).toString();								// Creates an Integer of relative Seat Number and converts it to a String
			g.drawString(colString, leftBlockPosX+5+(i*width), leftBlockPosY+20);			// String is affixed to drawSring method and co-ordinates tweaked to center the text in each box.
			g.drawRect(leftBlockPosX+(i*width), leftBlockPosY, width, height);				// Draw a rectangle at the stated X and Y- Pos. The next rect = X-Pos + (width of rectangle * horizontal psotion) [hence in a sequence]

			if (seatArrayList.contains((i+101)) != true)										// If The Array of available seats does not contain i+101 (Seat 1 of leftBlock is 101, Seat 2 is 102, etc)...
			{

				g.setColor(Color.red);														// Then change Draw Color to red
				g.fillRect(leftBlockPosX+(i*width), leftBlockPosY, width, height);			// Fill in the currently iterated rectangle
				g.setColor(Color.black);													// Change color back to default
				g.drawRect(leftBlockPosX+(i*width), leftBlockPosY, width, height);			// Redraw the Rectangle
				g.drawString(colString, leftBlockPosX+5+(i*width),leftBlockPosY+20);		// Redraw the number


			}

			for(int x=0; x<leftBlockSeatsRow; x++)													// For each column, loop while there are Rows..
			{
				String rowString = new Integer((i+(leftBlockSeatsCol*x))+101).toString();			// [As above]
				g.drawString (rowString, leftBlockPosX+5+(i*width), leftBlockPosY+(x*height)+20);

				g.drawRect(leftBlockPosX+(i*width),leftBlockPosY+(x*height), width, height);		// Draw A rectangle exactly like before but with Y-Pos + (height * vertical postition)
				if (seatArrayList.contains((i+(leftBlockSeatsCol*x))+101) != true)					// If the Array of available seats does not contain the relevent seat number...
				{
					g.setColor(Color.red);															 	// Change Draw Color ot red
					g.fillRect(leftBlockPosX+(i*width), leftBlockPosY+(x*height), width, height);		// Fill in the currently iterated rectangle
					g.setColor(Color.black);														 	// Change draw color back to default
					g.drawRect(leftBlockPosX+(i*width), leftBlockPosY+(x*height), width, height);		// Redraw outline of rectangle
					g.setColor(custom_grey);														 	// Set Color to Custom
					g.drawString (rowString, leftBlockPosX+5+(i*width), leftBlockPosY+(x*height)+20); 	// Redraw number
					g.setColor(Color.black);														 	// Change color back to default

				}
			}
		}


// DRAW CENTER BLOCK OF SEATS

		for(int i=0; i<centerBlockSeatsCol;i++)													// [Refer to Left Block Code comments]
		{
			String colString = new Integer (i+201).toString();
			g.drawString (colString, centerBlockPosX+5+(i*width), centerBlockPosY+20);
			g.drawRect(centerBlockPosX+(i*width), centerBlockPosY, width, height);

			if (seatArrayList.contains((i+201)) != true)
			{
				g.setColor(Color.red);
				g.fillRect(centerBlockPosX+(i*width), centerBlockPosY, width, height);
				g.setColor(Color.black);
				g.drawRect(centerBlockPosX+(i*width), centerBlockPosY, width, height);
				g.drawString(colString, centerBlockPosX+5+(i*width), centerBlockPosY+20);
			}

			for (int x=0; x<centerBlockSeatsRow; x++)
			{
				String rowString = new Integer ((i+(centerBlockSeatsCol*x))+201).toString();
				g.drawString(rowString, centerBlockPosX+5+(i*width), centerBlockPosY+(x*height)+20);

				g.drawRect(centerBlockPosX+(i*width), centerBlockPosY+(x*height), width, height);
				if (seatArrayList.contains((i+(centerBlockSeatsCol*x))+201) != true)
				{
					g.setColor(Color.red);
					g.fillRect(centerBlockPosX+(i*width), centerBlockPosY+(x*height), width, height);
					g.setColor(Color.black);
					g.drawRect(centerBlockPosX+(i*width), centerBlockPosY+(x*height), width, height);
					g.setColor(custom_grey);
					g.drawString (rowString, centerBlockPosX+5+(i*width), centerBlockPosY+(x*height)+20);
					g.setColor(Color.black);
				}
			}
		}

//DRAW RIGHT BLOCK OF SEATS

		for (int i=0; i<rightBlockSeatsCol;i++)													// [Refer to Left Block Code comments]
		{
			String colString = new Integer (i+301).toString();
			g.drawString(colString, rightBlockPosX+5+(i*width), rightBlockPosY+20);

			g.drawRect(rightBlockPosX+(i*width), rightBlockPosY, width, height);
			if (seatArrayList.contains((i+301)) != true)
			{
				g.setColor(Color.red);
				g.fillRect(rightBlockPosX+(i*width),rightBlockPosY,width,height);
				g.setColor(Color.black);
				g.drawRect(rightBlockPosX+(i*width), rightBlockPosY, width, height);
				g.drawString (colString, rightBlockPosX+5+(i*width), rightBlockPosY+20);
			}

			for(int x=0; x<rightBlockSeatsRow; x++)
			{
				String rowString = new Integer ((i+(rightBlockSeatsCol*x))+301).toString();
				g.drawString (rowString, rightBlockPosX+5+(i*width), rightBlockPosY+(x*height)+20);

				g.drawRect(rightBlockPosX+(i*width), rightBlockPosY+(x*height), width, height);
				if (seatArrayList.contains((i+(rightBlockSeatsCol*x))+301) != true)
				{
					g.setColor(Color.red);
					g.fillRect(rightBlockPosX+(i*width), rightBlockPosY+(x*height), width, height);
					g.setColor(Color.black);
					g.drawRect(rightBlockPosX+(i*width), rightBlockPosY+(x*height), width, height);
					g.setColor(custom_grey);
					g.drawString (rowString, rightBlockPosX+5+(i*width), rightBlockPosY+(x*height)+20);
					g.setColor(Color.black);
				}
			}
		}
}
