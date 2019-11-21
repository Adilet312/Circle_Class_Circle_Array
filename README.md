# **Circle,Point,and Array of Circle classes**

####  Program that will read in a set of data about circles from a text file and produce certain information about the data set.
#### 11/15/19

##### By _**Adilet Momunaliev**_
&nbsp;
## **Specs**
* _Circle object with the given coordinates for its center, radius, and red/green/blue values of a color.._
* _Second Select box contains all three sizes._
* CSC142Point getCenter() -- returns the center of this Circle. Do not return an alias to an instance variable 
* double getRadius() -- returns the radius of this Circle
* Color getColor() -- returns the Color of this Circle. Do not return an alias to an instance variable
* String toString() -- returns a String representation of this Circle
* double area() -- returns the area of this Circle
* double circumference() -- returns the circumference of this Circle
* boolean contains(CSC142Point p) -- returns true if this Circle contains this point, on the perimeter or the interior, false if not
* double distance(Circle other) -- returns the distance from this Circle's center to the other Circle's center.
* double brightness() -- returns the brightness of this Circle. The formula for brightness = 
* int getCount() -- returns the number of Circles in this set

* double changingBrightness() -- this methods determines the overall change in brightness from one Circle to the next. Initially, overall change is 0. Going through the set looking at consecutive Circles, if there's an increase in brightness, increment the overall change by 1. If there's a decrease in brightness from one Circle to the next, decrement the overall change by 1. Return this overall change.

* Circle[] smallLarge() -- returns an array of two Circles: the Circle with the smallest radius (index 0) and the Circle with the largest radius (index 1). If 2 or more Circles meet the same criteria, return the one stored in the set at the lowest index.
* Circle[] getClosest() -- returns the two Circle objects whose centers are the closest. The Circles may or may not be next to each other in the array. If there are 2 or more pairs of Circles that are the closest, return the first pair found.
* String toString() -- returns a String that represents the state of this object. The String should contain the toString() for each Circle object, separated by a new line character.

## **Setup/Installation Requirements**

* _Open Command Line_
* _Open BlueJ IDE_


## **Known Bugs**

_No bugs at the moment._

## **Github Link**
* _https://github.com/Adilet312/Circle_Class_Circle_Array

## Support and contact details

* _adiletm@hotmail.com_

## **Technologies Used**

* _BlueJ IDE - To write and edit the code_
* _BlueJ IDE - To help debug and see progress_

## **License**

*MIT License*
Copyright (c) 2019


