{\rtf1\ansi\ansicpg1252\cocoartf2761
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;}
{\colortbl;\red255\green255\blue255;\red12\green99\blue153;\red0\green0\blue0;\red29\green29\blue29;
\red0\green0\blue0;\red210\green50\blue85;\red135\green135\blue135;\red135\green91\blue44;\red255\green255\blue255;
\red133\green0\blue67;}
{\*\expandedcolortbl;;\cssrgb\c0\c46667\c66667;\cssrgb\c0\c0\c0\c1961;\cssrgb\c14902\c14902\c14902;
\cssrgb\c0\c0\c0;\cssrgb\c86667\c29020\c40784;\cssrgb\c60000\c60000\c60000;\cssrgb\c60392\c43137\c22745;\cssrgb\c100000\c100000\c100000\c50196;
\cssrgb\c60000\c0\c33333;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs26 \cf2 \cb3 \expnd0\expndtw0\kerning0
class\cf4  \cf6 Solution\cf4  \cf7 \{\cf4 \
    \cf2 public\cf4  \cf2 int\cf4  \cf6 numIdenticalPairs\cf7 (\cf2 int\cf7 []\cf4  nums\cf7 )\cf4  \cf7 \{\cf4 \
        \cf2 int\cf4  count \cf8 \cb9 =\cf4 \cb3  \cf10 0\cf7 ;\cf4 \
        \cf2 for\cf7 (\cf2 int\cf4  i \cf8 \cb9 =\cf4 \cb3  \cf10 0\cf7 ;\cf4  i \cf8 \cb9 <\cf4 \cb3  nums\cf7 .\cf4 length\cf7 ;\cf4  i\cf8 \cb9 ++\cf7 \cb3 )\{\cf4 \
            \cf2 for\cf7 (\cf2 int\cf4  j \cf8 \cb9 =\cf4 \cb3  i \cf8 \cb9 +\cf4 \cb3  \cf10 1\cf7 ;\cf4  j \cf8 \cb9 <\cf4 \cb3  nums\cf7 .\cf4 length\cf7 ;\cf4  j\cf8 \cb9 ++\cf7 \cb3 )\{\cf4 \
                \cf2 if\cf4  \cf7 (\cf4 nums\cf7 [\cf4 i\cf7 ]\cf4  \cf8 \cb9 ==\cf4 \cb3  nums\cf7 [\cf4 j\cf7 ])\{\cf4 \
                    count\cf8 \cb9 ++\cf7 \cb3 ;\cf4 \
                \cf7 \}\cf4 \
            \cf7 \}\cf4 \
        \cf7 \}\cf4 \
        \cf2 return\cf4  count\cf7 ;\cf4 \
    \cf7 \}\cf4 \
\cf7 \}\cf0 \cb1 \
}