SUMMARY = "Dreambox TS/M2TS audio passthrough helper lib"
DEPENDS = "libdlsym openssl"

SRC_URI[armv7ahf-neon.md5sum] = "d81a5e4de8cdcbcc8a6ea2a8333f6073"
SRC_URI[armv7ahf-neon.sha256sum] = "46944845a793bb4a727f21cabf5703367f391cd575b1d5ebe32632f758be3832"
SRC_URI[mips32el.md5sum] = "d3062d2d97f2086efb8e5e2f09a3608b"
SRC_URI[mips32el.sha256sum] = "37096521367538d7edc46313adde6ab7b9a4e9ca86f5469099183bc96ed921ce"

inherit opendreambox-precompiled-binary

FILES_${PN} = "${libdir}/lib*${SOLIBSDEV}"
FILES_SOLIBSDEV = ""

DEBIAN_NOAUTONAME_${PN} = "1"
