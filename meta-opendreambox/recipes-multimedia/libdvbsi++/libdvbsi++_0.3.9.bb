SUMMARY = "C++ parsing library for Service Information (SI) in DVB systems"
AUTHOR = "Andreas Oberritter"
SECTION = "libs/multimedia"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=a6f89e2100d9b6cdffcea4f398e37343"
OPENDREAMBOX_PROJECT = "obi/libdvbsi++"
SRCREV = "${@opendreambox_srcrev('515a1b65618324198fbeb8a5c8e3bf1caad7ffa6', d)}"

inherit autotools pkgconfig opendreambox-git
