{\rtf1\ansi\ansicpg1252\cocoartf2761
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;}
{\colortbl;\red255\green255\blue255;\red29\green29\blue29;}
{\*\expandedcolortbl;;\cssrgb\c14902\c14902\c14902;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs28 \cf2 \expnd0\expndtw0\kerning0
class Solution \{\
    public int fib(int n) \{\
        if(n < 2)\{\
            return n;\
        \}\
        return fib(n - 1) + fib(n - 2);\
    \}\
\}}