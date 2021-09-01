SUMMARY = "Show the tuner state as infobar popup"
HOMEPAGE = "https://github.com/betonme/e2openplugin-InfoBarTunerState"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://src/LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"
DEPENDS = "gettext-native"
SRCREV = "2c356db73506a8a696fc78653fc16e6a4b3cc901"
PE = "1"
PV = "4.0.3+git${SRCPV}"

SRC_URI = "git://github.com/opendreambox/e2openplugin-InfoBarTunerState.git"

S = "${WORKDIR}/git"

inherit autotools-brokensep

RDEPENDS_${PN} = " \
    enigma2-plugin-extensions-webinterface \
    python-re \
    python-shell \
"

require enigma2-plugin.inc
