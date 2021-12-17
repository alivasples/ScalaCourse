import org.scalatest.funsuite.AnyFunSuite

class S2_Tester extends AnyFunSuite{
  test("Q1"){
    assert(S2.toBinary(150) == "10010110")
    assert(S2.toBinary(839) == "1101000111")
    assert(S2.toBinary(784) == "1100010000")
    assert(S2.toBinary(11) == "1011")
    assert(S2.toBinary(568) == "1000111000")
    assert(S2.toBinary(403) == "110010011")
    assert(S2.toBinary(259) == "100000011")
    assert(S2.toBinary(469) == "111010101")
    assert(S2.toBinary(976) == "1111010000")
    assert(S2.toBinary(782) == "1100001110")
  }

  test("Q2"){
    assert(S2.toDecimal("100000") == 32)
    assert(S2.toDecimal("1001000111") == 583)
    assert(S2.toDecimal("10110101") == 181)
    assert(S2.toDecimal("111111000") == 504)
    assert(S2.toDecimal("110010101") == 405)
    assert(S2.toDecimal("1010000101") == 645)
    assert(S2.toDecimal("1100110101") == 821)
    assert(S2.toDecimal("1001110100") == 628)
    assert(S2.toDecimal("111011") == 59)
    assert(S2.toDecimal("110110001") == 433)
  }

  test("Q3"){
    assert(S2.reverse("zdikfpkiyzschzgwoqcfvootoycfrwkutldrchgzvcguqrflazjzipphve") == "evhppizjzalfrqugcvzghcrdltukwrfcyotoovfcqowgzhcszyikpfkidz")
    assert(S2.reverse("jdgcacotebjgdk") == "kdgjbetocacgdj")
    assert(S2.reverse("ueowy") == "ywoeu")
    assert(S2.reverse("fnegppvixmoptoazweeomdvyezaswfiqxeufgplzlvresy") == "yservlzlpgfuexqifwsazeyvdmoeewzaotpomxivppgenf")
    assert(S2.reverse("nqwjdocqjfhvrsdauopkzaugnkgxsdivpssvjxklespvpflpcxffxxrgx") == "xgrxxffxcplfpvpselkxjvsspvidsxgknguazkpouadsrvhfjqcodjwqn")
    assert(S2.reverse("jtaxabeozoruhguihvzqdhxhtmzqochzvrgjtbhibjujplfhmvwagqfbmcgadupsmufuunlgxltwgjrkjqfzp") == "pzfqjkrjgwtlxglnuufumspudagcmbfqgawvmhflpjujbihbtjgrvzhcoqzmthxhdqzvhiughurozoebaxatj")
    assert(S2.reverse("bmoipedfqpdjiicdwxqcykncdbcwhabapbgeyvflkrficurstqrdivxmsmx") == "xmsmxvidrqtsrucifrklfvyegbpabahwcbdcnkycqxwdciijdpqfdepiomb")
    assert(S2.reverse("ahbavvftwdtkkfptqzlwduwiwjkadhlvzakfhpqwpylwijnrrgdiexfrh") == "hrfxeidgrrnjiwlypwqphfkazvlhdakjwiwudwlzqtpfkktdwtfvvabha")
    assert(S2.reverse("kniyqfsvgmcszkozfkbjebzijziwgoxuvmjdltkzdmrhchunfvuhgumrfqzpnbmuacmdrglopgz") == "zgpolgrdmcaumbnpzqfrmughuvfnuhchrmdzktldjmvuxogwizjizbejbkfzokzscmgvsfqyink")
    assert(S2.reverse("awgfzxvibfwsbkgvchseejnpjffwdvttynkseuguswtbclgjnpxzntsbiuhzlnnssznyvcecxtopeiswsu") == "uswsiepotxcecvynzssnnlzhuibstnzxpnjglcbtwsuguesknyttvdwffjpnjeeshcvgkbswfbivxzfgwa")
  }

  test("Q4"){
    assert(S2.power(3, 4) == 81)
    assert(S2.power(6, 5) == 7776)
    assert(S2.power(8, 2) == 64)
    assert(S2.power(7, 4) == 2401)
    assert(S2.power(2, 9) == 512)
    assert(S2.power(10, 5) == 100000)
    assert(S2.power(6, 9) == 10077696)
    assert(S2.power(5, 3) == 125)
    assert(S2.power(5, 6) == 15625)
    assert(S2.power(4, 1) == 4)
  }


}
