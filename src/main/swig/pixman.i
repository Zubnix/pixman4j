%module LibPixman

//from swig lib
%include "typemaps.i";
//%include "arrays_java.i";
%include "carrays.i"
%array_class(int, IntArray);
%array_class(unsigned short, UShortArray);
%array_class(unsigned char, UCharArray);

%include "various.i";
%include "enumtypeunsafe.swg";
SWIG_JAVABODY_PROXY(public, public, SWIGTYPE);
SWIG_JAVABODY_TYPEWRAPPER(public, public, public, SWIGTYPE);

//own lib
%include "niobuffers_java.i";
%include "equals_hash_java.i";
%include "primitives_pixman.i";

%{
#include <pixman.h>
%}

%include "/usr/include/pixman-1/pixman.h";
