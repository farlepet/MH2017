import java.awt.geom.Point2D;
import java.util.*;
public class Driver
{

	public static void main(String[] args)
	{

/*
		Team patriots;

		Team eagles;

		patriots = new Team("Patriots");

		eagles = new Team ("Eagles");

		Player mitchell;

		Player riley;

		Player tim;

		Player pete;

		mitchell = new Player();

		riley = new Player();

		tim = new Player();

		pete = new Player();

		Injury mInjury;

		Injury rInjury;

		Injury tInjury;

		Injury pInjury;

		mInjury = new Injury(21,1,2018, 0); // head injury

		rInjury = new Injury(2,1,2018, 1); // torso injury

		tInjury = new Injury(3,1,2018, 2); // arm injury

		pInjury = new Injury(4,1,2018, 3); // leg injury

		mitchell.addInjury(mInjury);

		riley.addInjury(rInjury);

		tim.addInjury(tInjury);

		pete.addInjury(pInjury);

		pete.setWeight(350);

		tim.setWeight(170);

		riley.setWeight(185);

		mitchell.setWeight(100);

		pete.setHeight(60);

		tim.setHeight(70);

		mitchell.setHeight(50);

		riley.setHeight(63);

		mitchell.setNumber(1);

		pete.setNumber(2);

		riley.setNumber(3);

		tim.setNumber(4);

		mitchell.setName("Mitchell");

		riley.setName ("Riley");

		pete.setName("Pete");

		tim.setName("Tim");

                eagles.addPlayer(mitchell);
                eagles.addPlayer(riley);
                eagles.addPlayer(tim);
                eagles.addPlayer(pete);

                patriots.addPlayer(mitchell);
                patriots.addPlayer(riley);
                patriots.addPlayer(tim);
                patriots.addPlayer(pete);

		Offense offense = new Offense(patriots);
                offense.addPlayer(pete, TeamPositions.OFFENSIVE_LINE, new Point2D.Double(0.0,3.0));
                offense.addPlayer(tim, TeamPositions.WIDE_RECIEVER, new Point2D.Double(0.0,0.0));
                offense.addPlayer(mitchell, TeamPositions.OFFENSIVE_LINE, new Point2D.Double(6.0,3.0));

        Defense defense = new Defense(eagles);
                defense.addPlayer(riley, TeamPositions.DEFENSIVE_LINE, new Point2D.Double(0.0,-3.0));
                defense.addPlayer(tim, TeamPositions.CORNERBACK, new Point2D.Double(0.0,-0.1));
                defense.addPlayer(mitchell, TeamPositions.DEFENSIVE_LINE, new Point2D.Double(6.0,-3.0));
                
                
                System.out.println(offense.getPlayer(tim.getNumber()));

            RiskFactor[] riskArray;

            riskArray = offense. getRiskLevels(defense);

            for (int i = 0; i<riskArray.length;i++)
            {
            	System.out.println("Name: " + riskArray[i].getPlayerEntry().getPlayer().getName() + " Risk Factor: " + riskArray[i].getRiskScore());

            }
            riskArray = defense. getRiskLevels(offense);

            for (int i = 0; i<riskArray.length;i++)
            {
            	System.out.println("Name: " + riskArray[i].getPlayerEntry().getPlayer().getName() + " Risk Factor: " + riskArray[i].getRiskScore());

            }

		//System.out.println(pete.riskAgainst(riley));
		//System.out.println(riley.riskFactorAgainst());

		//System.out.println(tim.riskFactorAgainst());

		//System.out.println(pete.riskFactor());

*/




    	Player a, b, c, d, e, f, g, h, i, j, k;
    	Player a1, b1, c1, d1, e1, f1, g1, h1, i1, j1, k1;

    	a= new Player();
    	b= new Player();
 		c= new Player();
 		d= new Player();
 		e= new Player();
 		f= new Player();
 		g= new Player();
 		h= new Player();
 		i= new Player();
 		j= new Player();
 		k= new Player();

    	a1= new Player();
    	b1= new Player();
 		c1= new Player();
 		d1= new Player();
 		e1= new Player();
 		f1= new Player();
 		g1= new Player();
 		h1= new Player();
 		i1= new Player();
 		j1= new Player();
 		k1= new Player();

 		Injury head1Injury, head2Injury, head3Injury;
		Injury torso1Injury,torso2Injury,torso3Injury;
		Injury arm1Injury,arm2Injury;
		Injury leg1Injury,leg2Injury,leg3Injury;

		head1Injury = new Injury(21,1,2018, 0); // head injury
		head2Injury = new Injury(16,10,2016, 0);
		head3Injury = new Injury(30,12,2017, 0);

		torso1Injury = new Injury(2,1,2018, 1); // torso injury
		torso2Injury = new Injury(30,12,2017, 1);
		torso3Injury = new Injury(2,1,2016, 1);

		arm1Injury = new Injury(3,1,2018, 2); // arm injury
		arm2Injury = new Injury(3,11,2017, 2);

		leg1Injury = new Injury(4,1,2018, 3); // leg injury
		leg2Injury = new Injury(4,1,2017, 3);
		leg3Injury = new Injury(23,1,2018, 3);

		a.setWeight(300);
		b.setWeight(240);
		c.setWeight(152);
		d.setWeight(200);
		e.setWeight(120);
		f.setWeight(100);
		g.setWeight(236);
		h.setWeight(300);
		i.setWeight(205);
		j.setWeight(275);
		k.setWeight(189);

		a1.setWeight(185);
		b1.setWeight(200);
		c1.setWeight(167);
		d1.setWeight(230);
		e1.setWeight(189);
		f1.setWeight(225);
		g1.setWeight(191);
		h1.setWeight(150);
		i1.setWeight(269);
		j1.setWeight(290);
		k1.setWeight(132);

		a.setHeight(53);
		b.setHeight(63);
		c.setHeight(50);
		d.setHeight(58);
		e.setHeight(72);
		f.setHeight(80);
		g.setHeight(67);
		h.setHeight(55);
		i.setHeight(68);
		j.setHeight(75);
		k.setHeight(48);

		a1.setHeight(60);
		b1.setHeight(69);
		c1.setHeight(78);
		d1.setHeight(49);
		e1.setHeight(51);
		f1.setHeight(66);
		g1.setHeight(58);
		h1.setHeight(80);
		i1.setHeight(39);
		j1.setHeight(59);
		k1.setHeight(63);

		a.setNumber(1);
		b.setNumber(2);
		c.setNumber(3);
		d.setNumber(4);
		e.setNumber(5);
		f.setNumber(6);
		g.setNumber(7);
		h.setNumber(8);
		i.setNumber(9);
		j.setNumber(10);
		k.setNumber(11);

		a1.setNumber(1);
		b1.setNumber(2);
		c1.setNumber(3);
		d1.setNumber(4);
		e1.setNumber(5);
		f1.setNumber(6);
		g1.setNumber(7);
		h1.setNumber(8);
		i1.setNumber(9);
		j1.setNumber(10);
		k1.setNumber(11);

		a.addInjury(head2Injury);
		c.addInjury(arm1Injury);
		d.addInjury(leg1Injury);
		//d.addInjury(head1Injury);
		g.addInjury(torso1Injury);
		g.addInjury(torso3Injury);
		i.addInjury(leg3Injury);

		//b1.addInjury(head3Injury);
		c1.addInjury(arm1Injury);
		c1.addInjury(leg2Injury);
		e1.addInjury(torso1Injury);
		//g1.addInjury(head3Injury);
		h1.addInjury(leg3Injury);
		h1.addInjury(arm1Injury);
		//k1.addInjury(head1Injury);

		Team tommies, gophers;

		tommies = new Team("Tommies");
		gophers = new Team("Gophers");

		tommies.addPlayer(a);
		tommies.addPlayer(b);
		tommies.addPlayer(c);
		tommies.addPlayer(d);
		tommies.addPlayer(e);
		tommies.addPlayer(f);
		tommies.addPlayer(g);
		tommies.addPlayer(h);
		tommies.addPlayer(i);
		tommies.addPlayer(j);
		tommies.addPlayer(k);

		gophers.addPlayer(a1);
		gophers.addPlayer(b1);
		gophers.addPlayer(c1);
		gophers.addPlayer(d1);
		gophers.addPlayer(e1);
		gophers.addPlayer(f1);
		gophers.addPlayer(g1);
		gophers.addPlayer(h1);
		gophers.addPlayer(i1);
		gophers.addPlayer(j1);
		gophers.addPlayer(k1);

		Offense tommieOffense = new Offense(tommies);
                
        tommieOffense.addPlayer(a, TeamPositions.QUARTERBACK, new Point2D.Double(0.5,2.0));
        tommieOffense.addPlayer(b, TeamPositions.WIDE_RECIEVER, new Point2D.Double(15.0,1.0));
        tommieOffense.addPlayer(c, TeamPositions.OFFENSIVE_LINE, new Point2D.Double(3.0,1.0));
        tommieOffense.addPlayer(d, TeamPositions.OFFENSIVE_LINE, new Point2D.Double(1.5,1.0));
        tommieOffense.addPlayer(e, TeamPositions.OFFENSIVE_LINE, new Point2D.Double(0.0,1.0));
        //tommieOffense.addPlayer(f, TeamPositions.OFFENSIVE_LINE, new Point2D.Double(-1.5,1.0));
        tommieOffense.addPlayer(g, TeamPositions.OFFENSIVE_LINE, new Point2D.Double(-3.0,1.0));
        //tommieOffense.addPlayer(h, TeamPositions.WIDE_RECIEVER, new Point2D.Double(-15.0,1.0));
        tommieOffense.addPlayer(i, TeamPositions.TIGHT_END, new Point2D.Double(4.5,1.0));
        tommieOffense.addPlayer(j, TeamPositions.RUNNINGBACK, new Point2D.Double(0.0,4.0));
        tommieOffense.addPlayer(k, TeamPositions.RUNNINGBACK, new Point2D.Double(0.0,5.0));

    	Defense gopherDefense = new Defense(gophers);

    	gopherDefense.addPlayer(a1, TeamPositions.DEFENSIVE_LINE, new Point2D.Double(-1.5,-1.0));
    	gopherDefense.addPlayer(b1, TeamPositions.DEFENSIVE_LINE, new Point2D.Double(1.5,-1.0));
    	gopherDefense.addPlayer(c1, TeamPositions.DEFENSIVE_LINE, new Point2D.Double(3.0,-1.0));
    	gopherDefense.addPlayer(d1, TeamPositions.DEFENSIVE_LINE, new Point2D.Double(-3.0,-1.0));
    	gopherDefense.addPlayer(e1, TeamPositions.LINEBACKER, new Point2D.Double(0.0,-3.5));
    	gopherDefense.addPlayer(f1, TeamPositions.LINEBACKER, new Point2D.Double(2,-3.5));
    	gopherDefense.addPlayer(g1, TeamPositions.LINEBACKER, new Point2D.Double(-2.0,-3.5));
    	gopherDefense.addPlayer(h1, TeamPositions.SAFETY, new Point2D.Double(7.5,-8.0));
    	gopherDefense.addPlayer(i1, TeamPositions.SAFETY, new Point2D.Double(-7.5,-8.0));
    	gopherDefense.addPlayer(j1, TeamPositions.CORNERBACK, new Point2D.Double(15.0,-1.5));
    	gopherDefense.addPlayer(k1, TeamPositions.CORNERBACK, new Point2D.Double(-15.0,-1.5));
        
    	RiskFactor[] riskArray;

    	riskArray = tommieOffense.getRiskLevels(gopherDefense);

        for (int ii = 0; ii<riskArray.length;ii++)
        {
           	System.out.println("Offensive Names: " + riskArray[ii].getPlayerEntry().getPlayer().getNumber() + " Risk Factor: " + riskArray[ii].getRiskScore());

        }
        

        RiskFactor[] riskArray2;
        
        riskArray2 = gopherDefense.getRiskLevels(tommieOffense);

        for (int ii = 0; ii<riskArray2.length;ii++)
        {
          	System.out.println("Defensive Names: " + riskArray2[ii].getPlayerEntry().getPlayer().getNumber() + " Risk Factor: " + riskArray2[ii].getRiskScore());

        }

        TestGUI testGUI = new TestGUI();
        testGUI.show();
        testGUI.addRiskArray(riskArray);
        testGUI.addRiskArray(riskArray2);


    }
}