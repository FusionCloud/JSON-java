oldHash="$(cat ../../sums/JSONjavaBuild)"
newHash="$(tar c .git/* | md5sum)"
echo oldHash: $oldHash
echo newHash: $newHash

build=0

if [ -z "$oldHash" ] ; then
        build=1
        echo "No previous hash."
else
        if [ "X$oldHash" = "X$newHash" ]
        then
                echo "No change to hash."
        else
                build=1
                echo "$newHash" > ../../sums/JSONjavaBuild
        fi
fi

if [ "$build" -gt 0 ]
then
        gradle jar uploadArchives --parallel --daemon
fi