class  ArrayOp
{
    private double[] test = new double[5];





    public double[] getTest()
    {
		return test;
	}



	public void setTest(double[] t)
	{
		test = t;
	}



    public double getTotal(double[] t)
    {
		double total = 0;

		for(int i = 0; i < test.length; i++)
		{
			total += t[i];

		}


		return total;
	}


	public double getAverage(double[] t)
	{
		double avg = 0;
		double sum = 0;

		for(int i = 0; i < test.length; i++)
		{
			sum += t[i];


			avg = sum / test.length;
		}


		return avg;
	}

	public double getHighest(double[] t)
	{
		double highest = t[0];

		for(int i = 0 ; i < test.length; i++)
		{
			if(test[i] > highest)
			{
				highest = test[i];
			}
		}

		return highest;
	}

}