// Bowman's CSCI1301 Project 2
// Adam Adkins
// 6/11/2015
// Statistics File for Main.java & StaSum.java

import java.util.Arrays;

public class Statistics {
//*********************************Part One**********************************************
  public int[] arrayBig = new int[99]; 
  public Statistics(int[] array){
    arrayBig=array;}
//-------------------------------------------    
// Compute the Mean(Average) of an Array.
//-------------------------------------------
public int Mean(int [] array){
  int sum=0;
  if (array == null || array.length == 0) {
            throw new IllegalArgumentException("The data array either is null or does not contain any data.");}
  for(int i : array) sum += i;
  return ((int) sum)/array.length;}
//-------------------------------------------    
// Compute the Median of an Array.
//-------------------------------------------
public int Median(int [] array){
  int median;
  if (array == null || array.length == 0) {
            throw new IllegalArgumentException("The data array either is null or does not contain any data.");}
     if (array.length % 2 == 0)
        median = ((int)array[array.length/2] + (int)array[array.length/2 - 1])/2;
     else
        median = (int) array[array.length/2];
     return median;}
//-------------------------------------------    
// Compute the Mode of an Array.
//-------------------------------------------
public double Mode(int[] array){
    int count2 = 0;
    int count1 = 0;
    int pupular1 =0;
    int popular2 =0;
    if (array == null || array.length == 0) {
            throw new IllegalArgumentException("The data array either is null or does not contain any data.");}
    for (int i = 0; i < array.length; i++){
            pupular1 = array[i];
            count1 = 1;
        for (int j = i + 1; j < array.length; j++){
            if (pupular1 == array[j]) count1++;}
        if (count1 > count2){
                popular2 = pupular1;
                count2 = count1;}
        else if(count1 == count2){
            popular2 = Math.min(popular2, pupular1);}}
    return popular2;}
//-------------------------------------------    
// Compute the Maximum Value within an Array.
//-------------------------------------------
public int MaxValue(int[] array){
  if (array == null || array.length == 0) {
            throw new IllegalArgumentException("The data array either is null or does not contain any data.");}
  int max = 0;
  for (int i = 1; i < array.length; i++) {
    if (array[i] > max) {
      max = array[i];}}
  return max;}
//-------------------------------------------    
// Compute the Minimum Value within an Array.
//-------------------------------------------
public int MinValue(int[] array){
  if (array == null || array.length == 0) {
            throw new IllegalArgumentException("The data array either is null or does not contain any data.");}
  if (array.length == 0)
    return 0;
  int min = array[0];
  for (int i = 0; i < array.length; i++)
    if (array[i] < min){
        min = array[i];}
  return min;}
//-------------------------------------------    
// Compute the Standard Deviation an Array.
//-------------------------------------------
public double Deviation(int[] array){
  int sum2 = 0;
  double sd = 0;
  double average = 0;
  if (array == null || array.length == 0) {
            throw new IllegalArgumentException("The data array either is null or does not contain any data.");}
  for(int i : array) sum2 += i;
  average = ((double)sum2)/array.length;
  for (int i=0; i< array.length;i++){
    sd = sd + Math.pow(array[i] - average, 2);}
  return sd;}
//*********************************Part Two**********************************************
//-------------------------------------------    
// Compute the First Quartile of an Array.
//-------------------------------------------
public int FirstQuartile(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("The data array either is null or does not contain any data.");}
        Arrays.sort(array);
        int n = (int) Math.round(array.length * 25 / 100);
        return array[n];}
//-------------------------------------------    
// Compute the Third Quartile of an Array.
//-------------------------------------------
public int ThirdQuartile(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("The data array either is null or does not contain any data.");}
        Arrays.sort(array);
        int n = (int) Math.round(array.length * 75 / 100);
        return array[n];}
//-------------------------------------------   
// Compute the 5-Number Summary of an Array.
//-------------------------------------------
public int[] StatSum(int min, int firstQuartile, int median, int thirdQuartile, int max){
   int[] sumArray = new int[5]; 
   sumArray[0]=min;
   sumArray[1]=firstQuartile;
   sumArray[2]=median;
   sumArray[3]=thirdQuartile;
   sumArray[4]=max;
   return sumArray;}
//*********************************Part Three********************************************
//------------------------------------------------------------------------   
// Compute the Range of an Array.
//------------------------------------------------------------------------ 
public int Range(int[] array){
 if (array == null || array.length == 0) {
   throw new IllegalArgumentException("The data array either is null or does not contain any data.");}
  int max2 = 0;
  for (int i = 1; i < array.length; i++) {
    if (array[i] > max2) {
      max2 = array[i];}}
  if (array.length == 0)
    return 0;
  int min2 = array[0];
  for (int i = 0; i < array.length; i++)
    if (array[i] < min2){
        min2 = array[i];}
  int range = 0;
  range = max2-min2;
  return range;} 
//-------------------------------------------    
// Divide the Range from an Array equally.
//------------------------------------------

}
