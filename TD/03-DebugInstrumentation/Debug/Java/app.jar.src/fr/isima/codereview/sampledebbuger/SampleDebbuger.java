/*    */ package fr.isima.codereview.sampledebbuger;
/*    */ 
/*    */ import java.security.MessageDigest;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SampleDebbuger
/*    */ {
/*    */   public static void main(String[] args) {
/*    */     while (true) {
/*    */       try {
/*    */         while (true)
/* 16 */         { Thread.sleep(5000L);
/* 17 */           int randomNumber = (new Random()).nextInt();
/* 18 */           String hash = computeMD5Hash(Integer.toString(randomNumber));
/* 19 */           System.out.println("Random Number: " + randomNumber + " MD5 Hash: " + hash); }  break;
/* 20 */       } catch (InterruptedException|NoSuchAlgorithmException e) {
/* 21 */         e.printStackTrace();
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public static String computeMD5Hash(String input) throws NoSuchAlgorithmException {
/* 27 */     MessageDigest md = MessageDigest.getInstance("MD5");
/* 28 */     byte[] messageDigest = md.digest(input.getBytes());
/* 29 */     StringBuilder sb = new StringBuilder();
/* 30 */     for (byte b : messageDigest) {
/* 31 */       sb.append(String.format("%02x", new Object[] { Byte.valueOf(b) }));
/*    */     } 
/* 33 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              /Users/maxime/Documents/Devs/CodeReview/TD/03-DebugInstrumentation/Debug/app.jar!/fr/isima/codereview/sampledebbuger/SampleDebbuger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */