import java.text.DecimalFormat;
import java.util.Scanner;
public class CS220_Project3
{
	public static void main(String[] args)
	{
		// Your program should always output your name and the project number.
		// DO NOT DELETE OR COMMENT OUT. Replace with relevant info.
		System.out.println("Jaylen Quizon");
		System.out.println("Project 3");
		System.out.println("");

		// Helpful decimal formatters
		DecimalFormat mf = new DecimalFormat("$#,##0.00");	
		// For printing monetary values
		DecimalFormat pf = new DecimalFormat("0.00%");		
		// For printing percentage values (remember, this will multiply by 100 before printing)

		// Ask the user the stereo cost, interest rate( per year), & monthly payment
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the cost of your stereo (omit $ sign): ");
		double strCost = scan.nextDouble();
		System.out.print("Please enter the interest rate per year (in %): ");
		double anulInt = scan.nextDouble();
		System.out.print("Please enter the monthly payment you intend to make (omit $ sign): ");
		double monPay = scan.nextDouble();
		System.out.println();
		System.out.println();

		// Makes sure that the values are correctly inputed
		double intDec = anulInt / 100;
		double monIntPay = (intDec / 12) * strCost;

		// If-else statement for if the loan can be paid off or not
		// Program ends here if the statement can't be paid off
		if (monIntPay > monPay) {
			System.out.println();
			System.out.println("Loan amount: " + mf.format(strCost) + " Annual Interest Rate: " + pf.format(intDec) 
			+ " Monthly Payment: " + mf.format(monPay));
			System.out.println();
			System.out.println("This loan can never be paid off at these rates.");
		}
		// Program continues if the statement can be paid off
		else {
			System.out.println("Loan amount: " + mf.format(strCost) + " Annual Interest Rate: " + pf.format(intDec) 
			+ " Monthly Payment: " + mf.format(monPay));
			System.out.println();
			System.out.print("Month#");
			System.out.print("\tTotal-Payment");
			System.out.print("\tAmount-Interest-Paid");
			System.out.print("\tAmount-Debt-Paid");
			System.out.println("\tLoan-Balance");

			System.out.print("------");
			System.out.print("\t-------------");
			System.out.print("\t--------------------");
			System.out.print("\t----------------");
			System.out.println("\t------------");

			// Creating values for calculating the months, total pay, amount interest paid, amount
			// debt paid, & loan balance
			int month = 1;
			double amtIntPaid = monIntPay;
			double totalIntPaid = amtIntPaid;
			double amtDebtPaid = monPay - amtIntPaid;
			double loanBal = strCost - amtDebtPaid;

			// Generating table until the loan balance gets to 0
			while (loanBal >0) {
				System.out.print(month);
				System.out.print("\t" + mf.format(monPay));
				System.out.print("\t\t" + mf.format(amtIntPaid));
				System.out.print("\t\t\t" + mf.format(amtDebtPaid));
				System.out.println("\t\t\t" + mf.format(loanBal));

			// Since its always going down, we needed to create a formula that would show that interest 
			// is going down
				amtIntPaid = (intDec / 12) * loanBal;

			// Repeats until last line of table where monthly payment is leftover
				if (amtIntPaid + loanBal > monPay) {
					amtDebtPaid = monPay - amtIntPaid;
					loanBal = loanBal - amtDebtPaid;
					month++;
					totalIntPaid = totalIntPaid + amtIntPaid;
				}
				// Checks for monthly payment less than proposed
				else {
					amtIntPaid = (intDec / 12) * loanBal;
					amtDebtPaid = loanBal;
					monPay = loanBal + amtIntPaid;
					loanBal = 0;
					totalIntPaid = totalIntPaid + amtIntPaid;
					month++;

					// Final row of table
					System.out.print(month);
					System.out.print("\t" + mf.format(monPay));
					System.out.print("\t\t" + mf.format(amtIntPaid));
					System.out.print("\t\t\t" + mf.format(amtDebtPaid));
					System.out.println("\t\t\t" + mf.format(loanBal));
				}
			}
			// Shows the total amount of interest paid
			System.out.println();
			System.out.print("Total Amount of Interest Paid: " + mf.format(totalIntPaid));
		}
	}
}


/******************************************************************************
Insert 2 test cases, which represent program input/output for two different
combinations of inputs. You may literally copy and paste your console contents,
but your two test cases should be DIFFERENT from any test cases given in the
Project description itself.

------------
Test Case 1:
------------
Jaylen Quizon
Project 3

Please enter the cost of your stereo (omit $ sign): 2000
Please enter the interest rate per year (in %): 10
Please enter the monthly payment you intend to make (omit $ sign): 24


Loan amount: $2,000.00 Annual Interest Rate: 10.00% Monthly Payment: $24.00

Month#	Total-Payment	Amount-Interest-Paid	Amount-Debt-Paid	Loan-Balance
------	-------------	--------------------	----------------	------------
1	$24.00		$16.67			$7.33			$1,992.67
2	$24.00		$16.61			$7.39			$1,985.27
3	$24.00		$16.54			$7.46			$1,977.82
4	$24.00		$16.48			$7.52			$1,970.30
5	$24.00		$16.42			$7.58			$1,962.72
6	$24.00		$16.36			$7.64			$1,955.07
7	$24.00		$16.29			$7.71			$1,947.37
8	$24.00		$16.23			$7.77			$1,939.59
9	$24.00		$16.16			$7.84			$1,931.76
10	$24.00		$16.10			$7.90			$1,923.85
11	$24.00		$16.03			$7.97			$1,915.89
12	$24.00		$15.97			$8.03			$1,907.85
13	$24.00		$15.90			$8.10			$1,899.75
14	$24.00		$15.83			$8.17			$1,891.58
15	$24.00		$15.76			$8.24			$1,883.35
16	$24.00		$15.69			$8.31			$1,875.04
17	$24.00		$15.63			$8.37			$1,866.67
18	$24.00		$15.56			$8.44			$1,858.22
19	$24.00		$15.49			$8.51			$1,849.71
20	$24.00		$15.41			$8.59			$1,841.12
21	$24.00		$15.34			$8.66			$1,832.46
22	$24.00		$15.27			$8.73			$1,823.73
23	$24.00		$15.20			$8.80			$1,814.93
24	$24.00		$15.12			$8.88			$1,806.06
25	$24.00		$15.05			$8.95			$1,797.11
26	$24.00		$14.98			$9.02			$1,788.08
27	$24.00		$14.90			$9.10			$1,778.98
28	$24.00		$14.82			$9.18			$1,769.81
29	$24.00		$14.75			$9.25			$1,760.56
30	$24.00		$14.67			$9.33			$1,751.23
31	$24.00		$14.59			$9.41			$1,741.82
32	$24.00		$14.52			$9.48			$1,732.34
33	$24.00		$14.44			$9.56			$1,722.77
34	$24.00		$14.36			$9.64			$1,713.13
35	$24.00		$14.28			$9.72			$1,703.40
36	$24.00		$14.20			$9.80			$1,693.60
37	$24.00		$14.11			$9.89			$1,683.71
38	$24.00		$14.03			$9.97			$1,673.74
39	$24.00		$13.95			$10.05			$1,663.69
40	$24.00		$13.86			$10.14			$1,653.56
41	$24.00		$13.78			$10.22			$1,643.34
42	$24.00		$13.69			$10.31			$1,633.03
43	$24.00		$13.61			$10.39			$1,622.64
44	$24.00		$13.52			$10.48			$1,612.16
45	$24.00		$13.43			$10.57			$1,601.60
46	$24.00		$13.35			$10.65			$1,590.94
47	$24.00		$13.26			$10.74			$1,580.20
48	$24.00		$13.17			$10.83			$1,569.37
49	$24.00		$13.08			$10.92			$1,558.45
50	$24.00		$12.99			$11.01			$1,547.43
51	$24.00		$12.90			$11.10			$1,536.33
52	$24.00		$12.80			$11.20			$1,525.13
53	$24.00		$12.71			$11.29			$1,513.84
54	$24.00		$12.62			$11.38			$1,502.46
55	$24.00		$12.52			$11.48			$1,490.98
56	$24.00		$12.42			$11.58			$1,479.40
57	$24.00		$12.33			$11.67			$1,467.73
58	$24.00		$12.23			$11.77			$1,455.96
59	$24.00		$12.13			$11.87			$1,444.09
60	$24.00		$12.03			$11.97			$1,432.13
61	$24.00		$11.93			$12.07			$1,420.06
62	$24.00		$11.83			$12.17			$1,407.90
63	$24.00		$11.73			$12.27			$1,395.63
64	$24.00		$11.63			$12.37			$1,383.26
65	$24.00		$11.53			$12.47			$1,370.79
66	$24.00		$11.42			$12.58			$1,358.21
67	$24.00		$11.32			$12.68			$1,345.53
68	$24.00		$11.21			$12.79			$1,332.74
69	$24.00		$11.11			$12.89			$1,319.85
70	$24.00		$11.00			$13.00			$1,306.85
71	$24.00		$10.89			$13.11			$1,293.74
72	$24.00		$10.78			$13.22			$1,280.52
73	$24.00		$10.67			$13.33			$1,267.19
74	$24.00		$10.56			$13.44			$1,253.75
75	$24.00		$10.45			$13.55			$1,240.20
76	$24.00		$10.33			$13.67			$1,226.53
77	$24.00		$10.22			$13.78			$1,212.75
78	$24.00		$10.11			$13.89			$1,198.86
79	$24.00		$9.99			$14.01			$1,184.85
80	$24.00		$9.87			$14.13			$1,170.72
81	$24.00		$9.76			$14.24			$1,156.48
82	$24.00		$9.64			$14.36			$1,142.12
83	$24.00		$9.52			$14.48			$1,127.63
84	$24.00		$9.40			$14.60			$1,113.03
85	$24.00		$9.28			$14.72			$1,098.31
86	$24.00		$9.15			$14.85			$1,083.46
87	$24.00		$9.03			$14.97			$1,068.49
88	$24.00		$8.90			$15.10			$1,053.39
89	$24.00		$8.78			$15.22			$1,038.17
90	$24.00		$8.65			$15.35			$1,022.82
91	$24.00		$8.52			$15.48			$1,007.34
92	$24.00		$8.39			$15.61			$991.74
93	$24.00		$8.26			$15.74			$976.00
94	$24.00		$8.13			$15.87			$960.14
95	$24.00		$8.00			$16.00			$944.14
96	$24.00		$7.87			$16.13			$928.01
97	$24.00		$7.73			$16.27			$911.74
98	$24.00		$7.60			$16.40			$895.34
99	$24.00		$7.46			$16.54			$878.80
100	$24.00		$7.32			$16.68			$862.12
101	$24.00		$7.18			$16.82			$845.31
102	$24.00		$7.04			$16.96			$828.35
103	$24.00		$6.90			$17.10			$811.25
104	$24.00		$6.76			$17.24			$794.01
105	$24.00		$6.62			$17.38			$776.63
106	$24.00		$6.47			$17.53			$759.10
107	$24.00		$6.33			$17.67			$741.43
108	$24.00		$6.18			$17.82			$723.61
109	$24.00		$6.03			$17.97			$705.64
110	$24.00		$5.88			$18.12			$687.52
111	$24.00		$5.73			$18.27			$669.25
112	$24.00		$5.58			$18.42			$650.82
113	$24.00		$5.42			$18.58			$632.25
114	$24.00		$5.27			$18.73			$613.52
115	$24.00		$5.11			$18.89			$594.63
116	$24.00		$4.96			$19.04			$575.58
117	$24.00		$4.80			$19.20			$556.38
118	$24.00		$4.64			$19.36			$537.02
119	$24.00		$4.48			$19.52			$517.49
120	$24.00		$4.31			$19.69			$497.80
121	$24.00		$4.15			$19.85			$477.95
122	$24.00		$3.98			$20.02			$457.93
123	$24.00		$3.82			$20.18			$437.75
124	$24.00		$3.65			$20.35			$417.40
125	$24.00		$3.48			$20.52			$396.88
126	$24.00		$3.31			$20.69			$376.18
127	$24.00		$3.13			$20.87			$355.32
128	$24.00		$2.96			$21.04			$334.28
129	$24.00		$2.79			$21.21			$313.07
130	$24.00		$2.61			$21.39			$291.67
131	$24.00		$2.43			$21.57			$270.11
132	$24.00		$2.25			$21.75			$248.36
133	$24.00		$2.07			$21.93			$226.43
134	$24.00		$1.89			$22.11			$204.31
135	$24.00		$1.70			$22.30			$182.02
136	$24.00		$1.52			$22.48			$159.53
137	$24.00		$1.33			$22.67			$136.86
138	$24.00		$1.14			$22.86			$114.00
139	$24.00		$0.95			$23.05			$90.95
140	$24.00		$0.76			$23.24			$67.71
141	$24.00		$0.56			$23.44			$44.27
142	$24.00		$0.37			$23.63			$20.64
143	$20.82		$0.17			$20.64			$0.00

Total Amount of Interest Paid: $1,428.82

------------
Test Case 2:
------------
Jaylen Quizon
Project 3

Please enter the cost of your stereo (omit $ sign): 5000
Please enter the interest rate per year (in %): 50
Please enter the monthly payment you intend to make (omit $ sign): 15



Loan amount: $5,000.00 Annual Interest Rate: 50.00% Monthly Payment: $15.00

This loan can never be paid off at these rates.

 ******************************************************************************/