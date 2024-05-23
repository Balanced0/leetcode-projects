{\rtf1\ansi\ansicpg1252\cocoartf2761
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue255;\red255\green255\blue255;\red0\green0\blue0;
\red32\green108\blue135;\red101\green76\blue29;\red0\green0\blue109;\red144\green1\blue18;\red19\green118\blue70;
\red157\green0\blue210;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c100000;\cssrgb\c100000\c100000\c100000;\cssrgb\c0\c0\c0;
\cssrgb\c14902\c49804\c60000;\cssrgb\c47451\c36863\c14902;\cssrgb\c0\c6275\c50196;\cssrgb\c63922\c8235\c8235;\cssrgb\c3529\c52549\c34510;
\cssrgb\c68627\c0\c85882;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs26 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 class\cf0 \strokec4  \cf5 \strokec5 Solution\cf0 \strokec4 (\cf5 \strokec5 object\cf0 \strokec4 ):\cb1 \
\pard\pardeftab720\partightenfactor0
\cf0 \cb3     \cf2 \strokec2 def\cf0 \strokec4  \cf6 \strokec6 convertTemperature\cf0 \strokec4 (\cf7 \strokec7 self\cf0 \strokec4 , \cf7 \strokec7 celsius\cf0 \strokec4 ):\cb1 \
\cb3         \cf8 \strokec8 """\cf0 \cb1 \strokec4 \
\pard\pardeftab720\partightenfactor0
\cf8 \cb3 \strokec8         :type celsius: float\cf0 \cb1 \strokec4 \
\cf8 \cb3 \strokec8         :rtype: List[float]\cf0 \cb1 \strokec4 \
\cf8 \cb3 \strokec8         """\cf0 \cb1 \strokec4 \
\pard\pardeftab720\partightenfactor0
\cf0 \cb3         Kelvin = celsius + \cf9 \strokec9 273.15\cf0 \cb1 \strokec4 \
\cb3         Kelvin = \cf6 \strokec6 round\cf0 \strokec4 (Kelvin, \cf9 \strokec9 5\cf0 \strokec4 )\cb1 \
\cb3         Fahrenheit = celsius * \cf9 \strokec9 1.80\cf0 \strokec4  + \cf9 \strokec9 32.00\cf0 \cb1 \strokec4 \
\cb3         Fahrenheit = \cf6 \strokec6 round\cf0 \strokec4 (Fahrenheit, \cf9 \strokec9 5\cf0 \strokec4 )\cb1 \
\cb3         ans = [Kelvin, Fahrenheit]\cb1 \
\cb3         \cf10 \strokec10 return\cf0 \strokec4  ans\cb1 \
}