DSCH 2.5f
VERSION 23/07/02 00:53:59
BB(15,-135,120,-60)
SYM  #result
BB(95,-135,120,-95)
TITLE 95 -109  #digit
MODEL 89
PROP                                                                                                                                                                                                           
REC(100,-125,15,21,r)
VIS 2
PIN(100,-95,0.000,0.000)result4
PIN(105,-95,0.000,0.000)result3
PIN(110,-95,0.000,0.000)result2
PIN(115,-95,0.000,0.000)result1
PIN(115,-135,0.000,0.000)result0
LIG(115,-135,115,-134)
LIG(115,-132,115,-132)
LIG(95,-130,95,-100)
LIG(120,-130,95,-130)
LIG(120,-100,120,-130)
LIG(95,-100,120,-100)
LIG(100,-100,100,-95)
LIG(105,-100,105,-95)
LIG(110,-100,110,-95)
LIG(115,-100,115,-95)
FSYM
SYM  #clock1
BB(15,-93,30,-87)
TITLE 20 -90  #clock
MODEL 69
PROP   10.000 10.000                                                                                                                                                                                                       
REC(17,-92,6,4,r)
VIS 1
PIN(30,-90,1.500,0.210)clk1
LIG(25,-90,30,-90)
LIG(20,-92,18,-92)
LIG(24,-92,22,-92)
LIG(25,-93,25,-87)
LIG(15,-87,15,-93)
LIG(20,-88,20,-92)
LIG(22,-92,22,-88)
LIG(22,-88,20,-88)
LIG(18,-88,16,-88)
LIG(18,-92,18,-88)
LIG(25,-87,15,-87)
LIG(25,-93,15,-93)
FSYM
SYM  #fadd
BB(50,-100,90,-60)
TITLE 60 -90  #fadd
MODEL 6000
PROP                                                                                                                                                                                                            
REC(55,-95,30,30,r)
VIS 5
PIN(50,-90,0.000,0.000)C
PIN(50,-80,0.000,0.000)B
PIN(50,-70,0.000,0.000)A
PIN(90,-90,0.060,0.140)Sum
PIN(90,-80,0.060,0.140)Carry
LIG(50,-90,55,-90)
LIG(50,-80,55,-80)
LIG(50,-70,55,-70)
LIG(85,-90,90,-90)
LIG(85,-80,90,-80)
LIG(55,-95,55,-65)
LIG(55,-95,85,-95)
LIG(85,-95,85,-65)
LIG(85,-65,55,-65)
VLG module fadd( C,B,A,Sum,Carry);
VLG  input C,B,A;
VLG  output Sum,Carry;
VLG  xor #(12) xor2(w4,A,B);
VLG  nand #(7) nand2(w5,A,C);
VLG  nand #(6) nand2(w6,B,C);
VLG  nand #(7) nand2(w7,B,A);
VLG  xor #(12) xor2(Sum,w4,C);
VLG  nand #(6) nand3(Carry,w7,w6,w5);
VLG endmodule
FSYM
SYM  #clock3
BB(15,-73,30,-67)
TITLE 20 -70  #clock
MODEL 69
PROP   40.000 40.000                                                                                                                                                                                                       
REC(17,-72,6,4,r)
VIS 1
PIN(30,-70,1.500,0.210)clk3
LIG(25,-70,30,-70)
LIG(20,-72,18,-72)
LIG(24,-72,22,-72)
LIG(25,-73,25,-67)
LIG(15,-67,15,-73)
LIG(20,-68,20,-72)
LIG(22,-72,22,-68)
LIG(22,-68,20,-68)
LIG(18,-68,16,-68)
LIG(18,-72,18,-68)
LIG(25,-67,15,-67)
LIG(25,-73,15,-73)
FSYM
SYM  #clock2
BB(15,-83,30,-77)
TITLE 20 -80  #clock
MODEL 69
PROP   20.000 20.000                                                                                                                                                                                                       
REC(17,-82,6,4,r)
VIS 1
PIN(30,-80,1.500,0.210)clk2
LIG(25,-80,30,-80)
LIG(20,-82,18,-82)
LIG(24,-82,22,-82)
LIG(25,-83,25,-77)
LIG(15,-77,15,-83)
LIG(20,-78,20,-82)
LIG(22,-82,22,-78)
LIG(22,-78,20,-78)
LIG(18,-78,16,-78)
LIG(18,-82,18,-78)
LIG(25,-77,15,-77)
LIG(25,-83,15,-83)
FSYM
LIG(110,-80,90,-80)
LIG(30,-90,50,-90)
LIG(30,-80,50,-80)
LIG(30,-70,50,-70)
LIG(110,-95,110,-80)
LIG(90,-90,115,-90)
LIG(115,-90,115,-95)
FFIG C:\Dsch2\faddTest2.sch