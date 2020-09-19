DESCRIPTION = "Simple helloworld application"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""


SRCREV= "${AUTOREV}"
PE="1"

PV = "0.1+git${SRCPV}"

PVBASE := "{PV}"
PV= "${PVBASE}+{SRCPV}"

SRC_URI = "git://github.com/linuxemb/yocto.git;protocol=https"


S = "${WORKDIR}/git"

BB_GENERATE_MIRROR_TARBALLS="1"

do_compile() {
	${CC} hello.c ${LDFLAGS} -o hello
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 hello ${D}${bindir}
}

