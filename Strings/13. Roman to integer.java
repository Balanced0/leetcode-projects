{\rtf1\ansi\ansicpg1252\cocoartf2761
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue255;\red255\green255\blue255;\red0\green0\blue0;
\red32\green108\blue135;\red101\green76\blue29;\red0\green0\blue109;\red157\green0\blue210;\red144\green1\blue18;
\red19\green118\blue70;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c100000;\cssrgb\c100000\c100000\c100000;\cssrgb\c0\c0\c0;
\cssrgb\c14902\c49804\c60000;\cssrgb\c47451\c36863\c14902;\cssrgb\c0\c6275\c50196;\cssrgb\c68627\c0\c85882;\cssrgb\c63922\c8235\c8235;
\cssrgb\c3529\c52549\c34510;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs26 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 class\cf0 \strokec4  \cf5 \strokec5 Solution\cf0 \strokec4  \{\cb1 \
\pard\pardeftab720\partightenfactor0
\cf0 \cb3     \cf2 \strokec2 public\cf0 \strokec4  \cf5 \strokec5 int\cf0 \strokec4  \cf6 \strokec6 romanToInt\cf0 \strokec4 (\cf5 \strokec5 String\cf0 \strokec4  \cf7 \strokec7 s\cf0 \strokec4 ) \{\cb1 \
\cb3         \cf5 \strokec5 Map\cf0 \strokec4 <\cf5 \strokec5 Character\cf0 \strokec4 , \cf5 \strokec5 Integer\cf0 \strokec4 > \cf7 \strokec7 m\cf0 \strokec4  = \cf8 \strokec8 new\cf0 \strokec4  \cf5 \strokec5 HashMap\cf0 \strokec4 <>();\cb1 \
\cb3         \cf7 \strokec7 m\cf0 \strokec4 .\cf6 \strokec6 put\cf0 \strokec4 (\cf9 \strokec9 'I'\cf0 \strokec4 , \cf10 \strokec10 1\cf0 \strokec4 );\cb1 \
\cb3         \cf7 \strokec7 m\cf0 \strokec4 .\cf6 \strokec6 put\cf0 \strokec4 (\cf9 \strokec9 'V'\cf0 \strokec4 , \cf10 \strokec10 5\cf0 \strokec4 );\cb1 \
\cb3         \cf7 \strokec7 m\cf0 \strokec4 .\cf6 \strokec6 put\cf0 \strokec4 (\cf9 \strokec9 'X'\cf0 \strokec4 , \cf10 \strokec10 10\cf0 \strokec4 );\cb1 \
\cb3         \cf7 \strokec7 m\cf0 \strokec4 .\cf6 \strokec6 put\cf0 \strokec4 (\cf9 \strokec9 'L'\cf0 \strokec4 , \cf10 \strokec10 50\cf0 \strokec4 );\cb1 \
\cb3         \cf7 \strokec7 m\cf0 \strokec4 .\cf6 \strokec6 put\cf0 \strokec4 (\cf9 \strokec9 'C'\cf0 \strokec4 , \cf10 \strokec10 100\cf0 \strokec4 );\cb1 \
\cb3         \cf7 \strokec7 m\cf0 \strokec4 .\cf6 \strokec6 put\cf0 \strokec4 (\cf9 \strokec9 'D'\cf0 \strokec4 , \cf10 \strokec10 500\cf0 \strokec4 );\cb1 \
\cb3         \cf7 \strokec7 m\cf0 \strokec4 .\cf6 \strokec6 put\cf0 \strokec4 (\cf9 \strokec9 'M'\cf0 \strokec4 , \cf10 \strokec10 1000\cf0 \strokec4 );\cb1 \
\cb3         \cf5 \strokec5 int\cf0 \strokec4  \cf7 \strokec7 sum\cf0 \strokec4  = \cf10 \strokec10 0\cf0 \strokec4 ;\cb1 \
\cb3         \cf8 \strokec8 for\cf0 \strokec4 (\cf5 \strokec5 int\cf0 \strokec4  \cf7 \strokec7 i\cf0 \strokec4  = \cf10 \strokec10 0\cf0 \strokec4 ; i < \cf7 \strokec7 s\cf0 \strokec4 .\cf6 \strokec6 length\cf0 \strokec4 (); i++)\{\cb1 \
\cb3             \cf8 \strokec8 if\cf0 \strokec4 (i < \cf7 \strokec7 s\cf0 \strokec4 .\cf6 \strokec6 length\cf0 \strokec4 () - \cf10 \strokec10 1\cf0 \strokec4  && \cf7 \strokec7 m\cf0 \strokec4 .\cf6 \strokec6 get\cf0 \strokec4 (\cf7 \strokec7 s\cf0 \strokec4 .\cf6 \strokec6 charAt\cf0 \strokec4 (i)) < \cf7 \strokec7 m\cf0 \strokec4 .\cf6 \strokec6 get\cf0 \strokec4 (\cf7 \strokec7 s\cf0 \strokec4 .\cf6 \strokec6 charAt\cf0 \strokec4 (i + \cf10 \strokec10 1\cf0 \strokec4 )))\{\cb1 \
\cb3                 sum -= \cf7 \strokec7 m\cf0 \strokec4 .\cf6 \strokec6 get\cf0 \strokec4 (\cf7 \strokec7 s\cf0 \strokec4 .\cf6 \strokec6 charAt\cf0 \strokec4 (i));\cb1 \
\cb3             \}\cb1 \
\cb3             \cf8 \strokec8 else\cf0 \strokec4 \{\cb1 \
\cb3                 sum += \cf7 \strokec7 m\cf0 \strokec4 .\cf6 \strokec6 get\cf0 \strokec4 (\cf7 \strokec7 s\cf0 \strokec4 .\cf6 \strokec6 charAt\cf0 \strokec4 (i));\cb1 \
\cb3             \}\cb1 \
\cb3         \}\cb1 \
\cb3         \cf8 \strokec8 return\cf0 \strokec4  sum;\cb1 \
\cb3     \}\cb1 \
\cb3 \}\cb1 \
}