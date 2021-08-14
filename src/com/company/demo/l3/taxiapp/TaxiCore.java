package com.company.demo.l3.taxiapp;

import java.util.ArrayList;

public class TaxiCore {

	ArrayList<Taxi> taxis;

	public TaxiCore(ArrayList<Taxi> taxisArray)
	{
		taxis = taxisArray;
	}

	public void allocateTaxi(Customer customer)
	{
		int passenger_travelling_distance = calculateDistance(customer.getPp(), customer.getDp());

		int cost = calculateCost(passenger_travelling_distance);
		int time = customer.getPickupTime();
		int dropTime = calculateDropTime(time, passenger_travelling_distance);

		updateToCurrentTaxisInfo(time, dropTime, customer.getPp());

		ArrayList<Taxi> availableTaxis = checkTaxisForAvailability(time);

		sortTaxisBasedOnEarnings(availableTaxis);

		int min = 99999;

		Taxi allocatedTaxi = null;

		for(Taxi t: availableTaxis)
		{
			int distanceBetweenTaxiAndCustomer = t.getCp()-customer.getPp();
			if(distanceBetweenTaxiAndCustomer<min)
			{
				min = distanceBetweenTaxiAndCustomer;
				allocatedTaxi = t;
			}
		}

		if(allocatedTaxi!=null)
		{
			int extraTravellingDistance = calculateDistance(allocatedTaxi.getCp(),customer.getPp());

			allocatedTaxi.setEarned(allocatedTaxi.getEarned()+cost);
			setAvailability(allocatedTaxi, time, passenger_travelling_distance, extraTravellingDistance);
			allocatedTaxi.setCp(customer.getDp());

			System.out.println(allocatedTaxi);
			System.out.println(customer);
		}
		else
		{
			System.out.println("Booking Rejected");
		}

	}

	public void updateToCurrentTaxisInfo(int pickupTime, int dropTime, char pp)
	{
		for (Taxi taxi : taxis) {
			int extraTravel = calculateDistance(taxi.getCp(),pp);
			setFree(taxi,pickupTime-extraTravel,dropTime);
		}
	}

	public int calculateDropTime(int pickupTime, int distance)
	{
		return pickupTime+distance;
	}

	public void sortTaxisBasedOnEarnings(ArrayList<Taxi> taxiArray)
	{
		taxiArray.sort((a,b)->{ return a.getEarned()-b.getEarned();});
	}

	public int calculateDistance(int pp, int dp)
	{
		return Math.abs(pp-dp);
	}

	public int calculateCost(int distance)
	{
		distance = (distance*15)-5;
		int cost = (distance*10) + 500;
		return cost;
	}

	public ArrayList<Taxi> checkTaxisForAvailability(int time)
	{
		ArrayList<Taxi> ts = new ArrayList<>();

		for(Taxi t:taxis)
		{
			if(checkAvailability(t, time))
			{
				ts.add(t);
			}
		}

		return ts;
	}

	public boolean checkAvailability(Taxi t, int time)
	{
		return t.isFree();
	}

	public void setFree(Taxi t, int pickupTime, int dropTime)
	{
		if(t.getAvailBy()<pickupTime || t.getNotAvailBy()<dropTime)
		{
			t.setFree(true);
		}else {
			t.setFree(false);
		}
	}

	public void setAvailability(Taxi t, int pickupTime ,int passengerTravellingDistance, int extraTravellingDistance)
	{
		t.setAvailBy(calculateDropTime(pickupTime, passengerTravellingDistance));
		t.setNotAvailBy(pickupTime-extraTravellingDistance);
	}






}
